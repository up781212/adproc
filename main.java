 

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * This is the class that should be used to run our project. This is where the
 * project runs from and allows for easy creation of boxes. We have left some
 * Set and Get methods that we no longer use in this build should you wish to
 * refine the program to your specific company requirements.
 */
public class main {

    /**
     * This is the static variable for an ArrayList of Boxes so we can create a
     * log of all the boxes.
     */
    private static ArrayList<Box> orderList = new ArrayList<Box>();

    /**
     * Here we are creating the ArrayList for the number of boxes that each
     * order wanted.
     */
    private static ArrayList<Integer> orderNos = new ArrayList<Integer>();

    /**
     * Here we are initialising our static ArrayLists for creating the orders.
     */
    static {
        ArrayList<Box> orderList = new ArrayList();
        ArrayList<Integer> orderNos = new ArrayList();
    }

    /**
     * This is what the base of the program where all the functions are called.
     * First we create the main frame where the user inputs the data Then we
     * pull the details from the jFrame and create a test box to validate all
     * the information and check its within the box remits Then we create the
     * box and add it to the Box
     *
     * @param args We do not use any arguments however this makes sure that
     * there are no problems if they do
     * @throws Exception May be thrown when creating a java frame so we use this
     * to reload incase.
     */
    public static void main(String[] args) throws Exception {

        //setNativeFrame();
        jFrame aFrame = new jFrame();
        aFrame.setTitle("A frame");

        aFrame.setVisible(true);

        String invoice = "";
        boolean makingBox = true;

        while (makingBox) {
            while (aFrame.getNoIn() == true) {//wait for one millisecond if the form has not been submitted.
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }//listens for input

            //jFrame.error("Pending!");
            CheckBox box = new CheckBox(aFrame.getbWidth(), aFrame.getbLength(), aFrame.getbHeight(), aFrame.getGrade(), aFrame.getColour(), aFrame.getReinforcedB(), aFrame.getReinforcedC(), aFrame.getSealed());//add bits to get box from UI

            int score = box.typeDecider();
            Box orderedBox = makeBox(box, score);

            if (score != 6) { //boolean to check for issues with box upon creation and edit
                int orderNo = aFrame.getQuantity();
                addBoxesToOrder(orderedBox, orderNo);
                makingBox = aFrame.yesNo("Would you like to add another box to the invoice?");

            } else {
                jFrame.error("box grade is incorrect");
            }
            box.setGrade(3);
            aFrame.setNoIn(true);

        }
        invoice = produceInvoice();
        //after boxes are made
        aFrame.setVisible(false); //hide the input window
        //create an object of the invoiceUI window and load the invoice peviously created
        GuiInvoice invoiceUI = new GuiInvoice();
        invoiceUI.setTitle("Invoice");
        invoiceUI.setVisible(true);
        invoice = loadInvoice(invoice);
        invoiceUI.setInvoice(invoice);
    }

    /**
     * This loads an invoice that has been created into a single string which
     * can be used for methods that need the invoice
     *
     * @param invoiceName what is the name the invoice that you would like to
     * display
     * @return invoice it returns the string that is currently
     * @throws Exception This is incase there is an error on reading the file.
     */
    public static String loadInvoice(String invoiceName) throws Exception {
        String invoice = "";
        BufferedReader reader = new BufferedReader(new FileReader(invoiceName));
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            invoice += (currentLine + "\n");
        }
        return invoice;
    }

    /**
     * This switch case is used to make the boxes depending on which type of box
     * is passed through.
     *
     * @param box CheckBox that you have created that has passed its validation.
     * @param score the specific type of box that you wish to create eg
     * Type1,2,3,4 or 5.
     * @return this returns the newly created box ready to continue with the
     * program with.
     */
    public static Box makeBox(Box box, int score) {
        switch (score) {
            case 1:
                box = new BoxT1(box.getWidth(), box.getLength(), box.getHeight(), box.getGrade(), box.getSealable());
                break;
            case 2:
                box = new BoxT2(box.getWidth(), box.getLength(), box.getHeight(), box.getGrade(), box.getSealable());
                break;
            case 3:
                box = new BoxT3(box.getWidth(), box.getLength(), box.getHeight(), box.getGrade(), box.getSealable());
                break;
            case 4:
                box = new BoxT4(box.getWidth(), box.getLength(), box.getHeight(), box.getGrade(), box.getSealable());
                break;
            case 5:
                box = new BoxT5(box.getWidth(), box.getLength(), box.getHeight(), box.getGrade(), box.getSealable());
                break;
            case 6:
                jFrame.error("Box failed to build successfully! please retry");
                box = new CheckBox();
                break;
            default:
                box = new CheckBox();
                jFrame.error("you made it to default! This box isn't valid!");
                break;
        }
        return box;
    }

    /**
     * This adds boxes to the ArrayLists above and stores the quantity in a
     * different ArrayList however seeing as they are only added at the ~ the
     * same moment they will always be in the same place in the two different
     * ArrayLists.
     *
     * @param box this is the box that needs adding to the list
     * @param noBoxes this is the number of boxes requested.
     */
    public static void addBoxesToOrder(Box box, int noBoxes) {
        orderList.add(box);
        orderNos.add(noBoxes);
    }

    /**
     * This produces an invoice and outputs the data into a file for future use.
     * To make sure that no two files are named the same we have timestamped it
     * which also allows you to quickly find it in a list.
     *
     * @return invoiceName This returns the invoice name so that if a method
     * wishes to do something with the invoice such as loadInvoice() then we are
     * able to load it up without any problems.
     * @throws Exception Errors can be thrown on writing to a file if you delete
     * the file after we have created it but not completed the method.
     */
    public static String produceInvoice() throws Exception {
        String partInvoice = "";
        double invoiceTotal = 0;
        for (int i = 0; i < orderList.size(); i++) // for each box in the order
        {
            Box order = orderList.get(i); // box beign ordered
            invoiceTotal += order.getCost() * orderNos.get(i); // get its cost * the numever in the order
            partInvoice += order.produceCostings(i, orderNos.get(i)); // produce the writeup of the box specifications
            partInvoice += " \n\nThis brings the subototal to: " + invoiceTotal + "\n\n";
        }
        partInvoice += "\n\nThis brings the total cost to " + invoiceTotal + "\nShould you wish to proceed simply send the inoive to invoicing@BoxCompany.co.uk and your preffered payment method so we can draw up an proper invoice."; // finalising the invocie
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); // get the unique identifier ( being the date and time the order was produced
        String invoiceName = "invoice_" + timeStamp + ".txt"; // sets up the filename
        File iFile = new File(invoiceName);
        iFile.createNewFile(); // creates the file 
        String[] messageParts = partInvoice.split("\n"); //splits the message at each new line charecter
        FileOutputStream out = new FileOutputStream(invoiceName);
        for (String bits : messageParts) {
            byte buffer[] = bits.getBytes();
            out.write(buffer); // write the message
            out.flush(); // clean the buffer incase something goes wrong
            out.write(13); // newline charecter in windows
            out.write(10); // newline charecter in windows.
        }
        out.close(); // close the invoice
        return invoiceName;
    }
}

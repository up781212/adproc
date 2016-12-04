/*
 * This class details the base of how all the boxes will opperate.  
 */
 

/**
 * @author UP792564
 */

public abstract class Box {

    /**
     * Width of the box in mm
     */
    protected int width;

    /**
     *Length of the Box in mm
     */
    protected int length;

    /**
     * Height of the Box in mm
     */
    protected int height;

    /**
     * Area of the box in mm
     */
    protected int area;

    /**
     * Whether the grade is 1,2,3,4 or 5
     */
    protected int grade;

    /**
     * Number of Colours in the Box (0,1 or 2)
     */
    protected int noColours;

    /**
     * Is the bottom Reinforced.
     */
    protected boolean reinforcedB;

    /**
     * Are the corners Reinforced.
     */
    protected boolean reinforcedC;

    /**
     * Is the box Sealable.
     */
    protected boolean sealable;

    /**
     * This specifies the increase in cost for choices you have decided to have.
     */
    protected double costIncrease;

    /**
     * This will give you the cost per Box
     */
    protected double cost;
    
    /**
     * This is the default constructor which is used as it contains all the variables the Box would have 
     * @param bWidth stands for Box Width in mm
     * @param bLength stands for Box Length in mm
     * @param bHeight stands for Box Heigh tin mm
     * @param bgrade  stands for Box Grade between 1 and 5
     * @param noBColours  stands for number of colours on the Box 0,1 or 2
     * @param bReinforcedB stands for is the bottom of the box reinforced. its a boolean value
     * @param bReinforcedC stands for are the corners of the box reinforced. its a boolean value
     * @param bSealable stands for is the box sealable. this is a boolean value
     */
    public Box(int bWidth, int bLength, int bHeight, int bgrade,int noBColours,
                boolean bReinforcedB, boolean bReinforcedC,boolean bSealable){
        setWidth(bWidth);
        setLength(bLength);
        setHeight(bHeight);
        setArea();
        grade = bgrade;
        noColours = noBColours;
        reinforcedB = bReinforcedB;
        reinforcedC = bReinforcedC;
        sealable = bSealable;
    }
    
    /**
     * This is a testing class for the box where we can test whether we have been provided valid inputs
     */
    public Box(){ //for testing, blank
        grade = 3;
        noColours = 0;
        reinforcedB = false;
        reinforcedC = false;
        sealable = false;
        setWidth(101);
        setHeight(101);
        setLength(2000);
        setArea();
    }
   

    /**
     * This returns the width of the box
     * @return width in mm.
     */
    public int getWidth(){
        return width;
    }
    
    /**
     * This sets the width of the box by using the check side method to make sure its a valid side
    */
    private void setWidth(int iWidth){
        if(checkSide(iWidth)) width = iWidth;
    }

    /**
     * This returns the length of the file in mm.
     * @return Length in mm.
     */
    public int getLength(){
        return length;
    }

     /**
      * This sets the length of the box by using the check side method to make sure its a valid side
      * @param iLengh this accepts the length in mm.
     */
    private void setLength(int iLength){
        if(checkSide(iLength)) length = iLength;
    }

    /**
     * This returns the height of the file in mm.
     * @return Height in mm.
     */
    public int getHeight(){
        return height;
    }

     
    /**
     * This sets the height of the box by using the check side method to make sure its a valid side
     * @param iHeight this stands for input height which is in mm.
     */
    private void setHeight(int iHeight){
        if(checkSide(iHeight)) height = iHeight;
    }
    

    /**
     * We have presumed that the the smallest size is 10cm and the largest shall be 2m.
     * @param cValue this stands the check value that you input to make sure its valid.
     * @return  this returns a boolean value of whether the box is within the accepted range.
     */
    private boolean checkSide(int cValue){
        boolean clear = true;
        if(cValue < 100){
            jFrame.error("The box is too small. Boxes must be between 100cm and 2000cm");
            //boxOK = clear = false;
        }
        if(cValue > 2000){
             jFrame.error("The box is too big. Boxes must be between 100cm and 2000cm");
             //boxOK = clear = false;
         }
        return clear;
    }
    
    /**
     * This sets the grade if it is between 1 and 5.
     * @param grd This is the grade parameter which should be between 1 and 5 as the input passes the value but the if statement is in there just incase. 
     */
    public void setGrade(int grd){
        if (grd < 1 || grd > 5){
            jFrame.error("The grade is invalid. Grade are whole numbers from 1 to 5.");
        }
        else{
            grade = grd;
        }
    }
    
    /**
     * This method returns the grade which should be an integer between 1 and 5
     * @return int grade 1-5
     */
    public int getGrade(){
        return grade;
    }

    /**
     * This first calls the method setArea() then it returns the area as a integer in mm2
     * @return This returns the int area in mm2 
     */
    public int getArea(){
        setArea();
        return area;
    }

    /**
     * This method sets the area of the box by using the theory that a rectangles perimeter is the 3 different sides multiplied by 2 for the 6 sides
     */
    private void setArea(){
        area = width *height *2;
        area += height * length *2;
        area += length * width *2; 
        if (sealable)
                {
                    area += height * width; // to account for the flaps 
                }
    }

    /**
     * This returns the number of colour on the Box
     * @return returns the int 0,1 or 2 depending how many colors the box has
     */
    public int getNoColours(){
        return noColours;
    }


    /**
     * This returns the boolean value of whether the box has a reinforced bottom or not
     * @return a boolean value of true if reinforced bottom was wanted else returns false
     */
    public boolean getReinforcedB(){
        return reinforcedB;
    }
    
    /**
     * This sets the box's boolean to true if reinforced.
     * @param reinforced Whether the should be reinforced
     */
    private void setReinforcedB(boolean reinforced){
        reinforcedB = reinforced;
    }

    /**
     *  This gets the boolean value of whether the box has reinforced corners or not
     * @return boolean Value True if the corners are reinforced else it returns False
     */
    public boolean getReinforcedC(){
        return reinforcedC;
    }
    
    /**
     * This returns the boolean value of whether the  box is sealable or not.
     * @return will return True if the box is sealable else it will return false.
     */
    public boolean getSealable(){
        return sealable;
    }
    
    /**
     * This is a boolean value that sets the box to be sealable or unsealable with the parameter seal
     * @param seal this should be a boolean value True if you wish for it to be sealable else False
     */
    public void setSealable(boolean seal){
        sealable = seal;
    }
    
   /**
    * This method sets the increased costs associated with each of the optional extras that have been requested with the box. 
    */
    abstract void setCostIncrease();

    /**
     * This switch is shared by all Boxes as the grades for boxes doesn't change depending on type. this will return the cost per £ in m2 
     * Although there will be some cases which cannot be reach we deemed it bad coding to have basically the same switch in each class minus 1 or 2 options when we could just input the list into the Box class. If there where more choices
     * we would change this to an abstract class and override it in each method
     * @return returns the cost per m2 of cardboard in pounds (£)
     */
    public double gradeCost()
    {
        double gradecost;
        switch (grade) {
            case 1:
                gradecost = 0.5;
                break;
            case 2:
                gradecost = 0.6;
                break;
            case 3:
                gradecost = 0.72;
                break;
            case 4:
                gradecost = 0.9;
                break;
            case 5:
                gradecost = 1.4;
                break;
            default:
                System.out.println("Im afraid we are unable to detect the grade size you have rewuested please try again.");
                gradecost = 0;
                break;   
        }
        return gradecost;
    }
    

    /**
     * This sets the cost by getting the area, then multiplying the area (after being converted to m2) by the cost per m2 of cardboard got via gradeCost()
     * This then rounds the value using the roundIt() method to return the cost in pounds and pence.
     */
    public void setCost()
    {
        double gArea = getArea();
        double cboardCost = gradeCost()* (gArea/1000000); // converting area to m2 1,000,000  is mm2 to m2
        setCostIncrease();
        cost = cboardCost * costIncrease;
        cost = roundIt(cost);
    }
    
    //

    /**
     * This returns the cost of the current box. It first sets the cost to make sure that all details are up to date first however.
     * @return the double cost which is in £'s and the decimal value is it pence.
     */
    public double getCost()
    {
        setCost();
        return cost;
    }

    /**
     * This produces a string message of the cost of the box as well as other important details for the produceInvoice in the main method
     * We could have done this in the main method but we felt that it made more sense to put it with the box.
     * @param boxOrderNo is the placement number in the orderList that the box is. 
     * @param noInOrder This is the number of this kind of box you wish to order
     * @return message This will return the that has been created based on the options 
     */
    public String produceCostings(int boxOrderNo, int noInOrder)
    {
        String message = ("----------------------------------------------------\n");
        message += ("------ Box Set "+ boxOrderNo + " ------ number in order " + noInOrder + " ---");
        message += ("\n\n\nBox length: " + length + " Box width: " + width + " Box height: " + height + "\n" );
        message += ("Box grade : " + grade + "\n");
        message += (getChoices()) + "\n";
        message += ("The total cost per box is approximatly: £" + getCost()) + "\n";
        message += ("You have selected to have: " + noInOrder + "of this type of box" + "\n");
        message += ("This brings the total cost of this order to: £"+ (cost*noInOrder) +"\n");
        message += ("----------------------------------------------------");
        return message;
    }
    
    /**
     * This method creates an easily readable line with all the choices that have been made on the box so that you can see where the costs come from. 
     * @return This will return a String that outlines the options that have been selected in this box.
     */
    abstract String getChoices();
    
    /**
     * This method will convert doubles into 2 decimal places that can then be used for converting cost to pounds.
     * @param nRounding This parameter is for the number that needs rounding.
     * @return This will return the rounded number to 2 decimal places.
     */
    public double roundIt(double nRounding)
    {
        int multiplied = (int)(nRounding *1000); // 2 decimal places would be multipling by 100 so we multiple by a further 10 to get the digit that needs rounding then convert it to an int to get rid of the rest of the number
        int uRoundingPoint = ((int)(nRounding*100)*10); // this does a similar thing but we want it to 2dp so that we can get the final digit by itself
        int digit = multiplied - uRoundingPoint; // this gets the digit eg. if my number was 13.34111 then the previous two methods will get it to 13431 - 13430.
        if (digit >= 5) // this works out if we need it round it up. 
        {
            uRoundingPoint += 10;
        }
        double rounded = (double)(uRoundingPoint)/1000; // this converts it back to 2 decimal places
        return rounded;
    }
}

 

import javax.swing.JOptionPane;

/**
 * This is the class for our GUI it deals with all the user input and sends it back to the main method for box creation and invoice creation.
 */
public class OrderInput extends javax.swing.JFrame {

    /**
     * stops main class from accessing the form data until the form is submitted when it is False
     * but allows access while True.
     */
    private boolean noIn;
    /**
     * This sets the original number of colours to zero ready to be overwritten if required
     */
    int colour = 0;
    
    /**
     * This sets the original grade to 0 ready to be overwritten when the order button is pressed
     */
    int grade = 0;
    
    /**
     * This sets the default value of reinforcedB to False ready to be overwritten if needed 
     */
    boolean reinforcedB = false;
    
    /**
     * This sets the default value of reinforcedC to False ready to be overwritten if needed 
     */
    boolean reinforcedC = false;

    /**
     * This sets the default value of sealed to False ready to be overwritten if needed 
     */
    boolean sealed = false;

    /**
     * This sets the default value of quantity to 0 ready to be overwritten when provided with a valid input
     */
    int quantity = 0;

    /**
     * This sets the default value of bwidth to 0 ready to be overwritten when provided with a valid input
    */
    int bwidth = 0;
    
    /**
     * his sets the default value of bheight to 0 ready to be overwritten when provided with a valid input 
     */
    int bheight = 0;
    
    /**
     * his sets the default value of blength to 0 ready to be overwritten when provided with a valid input
     */
    int blength = 0;

    /**
     * This returns the number of colours
     * @return returns the int 0,1 or 2 depending how many colours have been seleceted
     */
    public int getColour() {
        return colour;
    }

     /**
     * This method returns the grade which should be an integer between 1 and 5
     * @return int grade 1-5
     */
    public int getGrade() {
        return grade;
    }

    /**
     * This gets the boolean value of whether it has reinforced bottom or not.
     * @return boolean True for it having reinforced corners and False for not
     */
    public boolean getReinforcedB() {
        return reinforcedB;
    }

    /**
     *  This gets the boolean value of whether the box has reinforced corners or not
     * @return True for Reinforced corners and False for not
     */
    public boolean getReinforcedC() {
        return reinforcedC;
    }

     /**
     * This returns the boolean value of whether it is sealable or not.
     * @return will return True if it is sealable else it will return false.
     */
    public boolean getSealed() {
        return sealed;
    }

     /**
     * This returns the width.
     * @return width in mm.
     */
    public int getbWidth() {
        return bwidth;
    }

    /**
     * This returns the length.
     * @return Length in mm.
     */
    public int getbLength() {
        return blength;
    }
    
    /**
     * This returns the height.
     * @return Height in mm.
     */
    public int getbHeight() {
        return bheight;
    }

    /**
     * This gets whether you can input or not
     * @return 
     */
    public boolean getNoIn() {
        return noIn;
    }

    /**
     * This sets noIn (whether you can input into the frame) to true or False.
     * @param in boolean value, can you input True = Yes you can input, False = No you can't input
     */
    public void setNoIn(boolean in) {
        noIn = in;
    }

    /**
     * This gets the quantity of boxes you have ordered in the jFrame so you.
     * @return an integer between 1 and 100 for the number of boxes you wish to produce
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * This creates a standard error message
     * @param err If the error has not got a specific error code it will produce this error.
     */
    public static void error(String err) {
        JOptionPane.showMessageDialog(null,
                err,
                "Inane error",
                JOptionPane.ERROR_MESSAGE);
    }

    /**
     * This creates a basic yes no dialog. which will return a True if yes is selected and a False if no is selected
     * @param question This is the text you wish to display as a question for the yes no button frame.
     * @return response Which is boolean value True if yes is selected and False if no is seleceted
     */
    public static boolean yesNo(String question) {
        boolean response = false;
        int dialog = JOptionPane.showConfirmDialog(null, question, "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        response = dialog == JOptionPane.YES_OPTION;
        return response;
    }

    /**
     * Creates new form jFrame
     */
    public OrderInput() {
        initComponents();
        noIn = true;
        rbnNoColour.setSelected(true);
        rbnG1.setSelected(true);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tbxLength = new javax.swing.JTextField();
        tbxHeight = new javax.swing.JTextField();
        tbxWidth = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rbn1Colour = new javax.swing.JRadioButton();
        rbn2Colour = new javax.swing.JRadioButton();
        rbnNoColour = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        rbnG1 = new javax.swing.JRadioButton();
        rbnG2 = new javax.swing.JRadioButton();
        rbnG3 = new javax.swing.JRadioButton();
        rbnG4 = new javax.swing.JRadioButton();
        rbnG5 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        spnQTY = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cbxCorner = new javax.swing.JCheckBox();
        cbxBottom = new javax.swing.JCheckBox();
        cbxSealable = new javax.swing.JCheckBox();
        btnOrder = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Box Length");

        jLabel2.setText("Box Height");

        jLabel3.setText("Box Width");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Box Dimensions (mm)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tbxWidth)
                    .addComponent(tbxHeight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(tbxLength))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tbxLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tbxHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tbxWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" Colour Painting");

        buttonGroup2.add(rbn1Colour);
        rbn1Colour.setText("1 Colour");

        buttonGroup2.add(rbn2Colour);
        rbn2Colour.setText("2 Colour");

        buttonGroup2.add(rbnNoColour);
        rbnNoColour.setSelected(true);
        rbnNoColour.setText("None");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbn1Colour)
                            .addComponent(rbn2Colour)
                            .addComponent(rbnNoColour))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbn1Colour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbn2Colour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbnNoColour))
        );

        buttonGroup1.add(rbnG1);
        rbnG1.setText("Grade 1");
        rbnG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnG1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbnG2);
        rbnG2.setText("Grade 2");

        buttonGroup1.add(rbnG3);
        rbnG3.setText("Grade 3");

        buttonGroup1.add(rbnG4);
        rbnG4.setText("Grade 4");

        buttonGroup1.add(rbnG5);
        rbnG5.setText("Grade 5");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Box Grade");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(rbnG1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbnG2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbnG3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbnG4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbnG5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnG1)
                    .addComponent(rbnG2)
                    .addComponent(rbnG3)
                    .addComponent(rbnG4)
                    .addComponent(rbnG5))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        rbnG1.getAccessibleContext().setAccessibleName("Radio1");
        rbnG1.getAccessibleContext().setAccessibleDescription("");

        jLabel8.setText("Quantity");

        spnQTY.setValue(1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spnQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(" Reinforcement");

        cbxCorner.setText("Corner");

        cbxBottom.setText("Bottom");

        cbxSealable.setText("Sealable Top");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxCorner)
                    .addComponent(cbxBottom)
                    .addComponent(cbxSealable))
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxCorner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxBottom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxSealable))
        );

        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Costs");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jTextPane1.setText("Grades per m^2\n Grade 1.........£0.50\n Grade 2.........£0.60\n Grade 3.........£0.72\n Grade 4.........£0.90\n Grade 5.........£1.40\n\nAdditions add percentage\n 1 colours..........13% \n 2 colours..........16% \n Reinforced bottom..14%\n Reinforced corners.10%\n Sealable top........8%\n");
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrder)
                        .addGap(9, 9, 9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOrder)
                            .addComponent(btnClear)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void rbnG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnG1ActionPerformed
    }//GEN-LAST:event_rbnG1ActionPerformed

    /**
     * This method clears and resets forms to default states.
     * @param evt when you press the clear button this code will clear the 
     */
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        tbxLength.setText("");
        tbxWidth.setText("");
        tbxHeight.setText("");
        spnQTY.setValue(1);

        rbnNoColour.setSelected(true);
        rbnG1.setSelected(true);

        cbxCorner.setSelected(false);
        cbxBottom.setSelected(false);
        cbxSealable.setSelected(false);

    }//GEN-LAST:event_btnClearActionPerformed

    /**
    * When the order button is pressed, the below code will assign the fields with the values input by the user.
    * Some validation is also provided, to ensure the user does not enter strings instead of integers, or that
    * the values fall outside the maximum or minimum. The user is then prompted and required to edit the values.
    * @param evt This triggers when the order button is pressed.
    */
    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        boolean validated = true; //false when any value throws an exception.

        //assign the colour option.
        if (rbnNoColour.isSelected()) {
            colour = 0;
        }
        if (rbn1Colour.isSelected()) {
            colour = 1;
        }
        if (rbn2Colour.isSelected()) {
            colour = 2;
        }

        //check and the width, height and length to see if they are valid intergers.
        try {
            bwidth = Integer.parseInt(tbxWidth.getText());
        } catch (NumberFormatException e) {
            error("The width specified must be a whole number between 100 and 2000.");
            validated = false;
        }

        try {
            bheight = Integer.parseInt(tbxHeight.getText());
        } catch (NumberFormatException e) {
            error("The height specified must be a whole number between 100 and 2000.");
            validated = false;
        }

        try {
            blength = Integer.parseInt(tbxLength.getText());
        } catch (NumberFormatException e) {
            error("The length specified must be a while nume between 100 and 2000.");
            validated = false;
        }

        //assign grade
        if (rbnG1.isSelected()) {
            grade = 1;
        } else if (rbnG2.isSelected()) {
            grade = 2;
        } else if (rbnG3.isSelected()) {
            grade = 3;
        } else if (rbnG4.isSelected()) {
            grade = 4;
        } else if (rbnG5.isSelected()) {
            grade = 5;
        }

        //assign checkbox values to fields
        sealed = cbxSealable.isSelected();
        reinforcedB = cbxBottom.isSelected();
        reinforcedC = cbxCorner.isSelected();

        try {
            quantity = (int) spnQTY.getValue();
        } catch (NumberFormatException e) {
            error("The quantity must be a number above 1.");
            validated = false;
        }

        //check if the minimum size of the width, height and length are valid.
        if (bwidth < 100 || bheight < 100 || blength < 100) {
            error("The size of width, height and length must be greater than 99.");
            validated = false;
        } //check if the maximum size of the width, height and length are valid.
        else if (bwidth > 2000 || bheight > 2000 || blength > 2000) {
            error("The size of width, height and length must be 2000 or less");
            validated = false;
        }
        //check the qantity falls between the minimum and maximum values.
        if (quantity < 1) {
            error("The quantity must be one or greater.");
            validated = false;
        } else if (quantity > 100) {
            error("Sorry, only a maximum of 100 boxes of the same type per order.");
            validated = false;
        }

        noIn = !validated;
    }//GEN-LAST:event_btnOrderActionPerformed

    /**
     * This sets up all the button, labels, boxes and text fields.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderInput.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderInput.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderInput.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderInput.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderInput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnOrder;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cbxBottom;
    private javax.swing.JCheckBox cbxCorner;
    private javax.swing.JCheckBox cbxSealable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JRadioButton rbn1Colour;
    private javax.swing.JRadioButton rbn2Colour;
    private javax.swing.JRadioButton rbnG1;
    private javax.swing.JRadioButton rbnG2;
    private javax.swing.JRadioButton rbnG3;
    private javax.swing.JRadioButton rbnG4;
    private javax.swing.JRadioButton rbnG5;
    private javax.swing.JRadioButton rbnNoColour;
    private javax.swing.JSpinner spnQTY;
    private javax.swing.JTextField tbxHeight;
    private javax.swing.JTextField tbxLength;
    private javax.swing.JTextField tbxWidth;
    // End of variables declaration//GEN-END:variables
}

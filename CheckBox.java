public class CheckBox extends Box {
    

    public CheckBox (int bWidth, int bLength, int bHeight, int bgrade,int noBColours,
                boolean bReinforcedB, boolean bReinforcedC,boolean bSealable)
    {
        super(bWidth, bLength, bHeight, bgrade, noBColours, bReinforcedB,  bReinforcedC, bSealable);
    }
    
    /**
     * this is the default Box construct which we use if our validation didn't catch something (as a backup) 
     */
    public CheckBox()
    {
        super();
    }
    
        /**
        * This method selects which box to check against given the input.
        * It narrows down the choices from the most optional extras to the least as that way we only have to check one thing at a time to decide the box type
        * It will then call the relevant checkType method so that we can see whether the selected box fits all the requirements of that box.
        */
        public int typeDecider(){
        if (reinforcedC){
            if(checkType5()){
               return 5;
            }
            else{
                return 6;
            }
        }
        else if(reinforcedB){
            if( checkType4()){
                return 4;
            }
            else{
                return 6;
            }
        }
        else if(noColours == 2 ){
            if(checkType3()){
                return 3;
            }
            else{
                return 6;
            }
        }
        else if(noColours == 1){
            if(checkType2()){
                return 2;
            }
            else{
                return 6;
            }
        }
        else{
            if (checkType1()){
                return 1;
            }
            else{
                return 6;
            }
        }
    }
    
    /**
     * This checks the that it is a valid for box type 1. (all optional extras that would prevent it from being box one would have been removed by this point bar the box grade).
     * @return True if its valid or False if not.
     */
    public boolean checkType1(){
        return grade >= 1 && grade <= 3;
    }
    
    /**
     * This checks the that it is a valid for box type 2. (This has to check the grade is with its remit).
     * @return True if its valid or False if not.
     */    
    public boolean checkType2(){
        return grade >= 2 && grade <= 4;
    }
    
    /**
     * This checks the that it is a valid for box type 3. (this checks that the grade is within its remit).
     * @return True if its valid or False if not.
     */
    public boolean checkType3(){
        return grade >= 2 && grade <= 5;
    }
    /**
     * This checks the that it is a valid for box type 4. (This checks that there are the correct number of colours and the grade is within its remit).
     * @return True if its valid or False if not.
     */
    public boolean checkType4(){
        return grade >= 2 && grade <= 5 && noColours == 2;
    }
    
    /**
     * This checks the that it is a valid for box type 5. (This has to check that all features are correct bar reinforced corners as nothing else has been removed yet).
     * @return True if its valid or False if not.
     */
    public boolean checkType5(){
        return grade >= 2 && grade <= 5 && noColours == 2 && reinforcedB;
    }

    @Override
    public void setCostIncrease() 
    {
            cost = 0;
        throw new UnsupportedOperationException("CheckBox is a validation class only"); //Checkbox class is for validation only 
    
    }

    @Override
    public String getChoices() 
    {
        
        return ("CheckBox is a validation class only"); //To change body of generated methods, choose Tools | Templates.
    }
}

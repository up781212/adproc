public class BoxT4 extends Box{
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
    public BoxT4(int bWidth, int bLength, int bHeight, int bGrade, boolean bSealable){
        super(bWidth, bLength, bHeight, bGrade, 2, true, false, bSealable);
    }
    
        @Override
    public String getChoices()
    {
        if (!sealable){
            return "You have selected 2 colours and for a reinforced bottom.";
        }
            return "You have selected 2  colours and for the box to be sealable and have a reinforced bottom";
    }
    @Override
    public void setCostIncrease()
    {
        costIncrease = 1; // 1x anything is itself
        costIncrease += .16; // 2 colors
        costIncrease += .14;
        
        if (sealable == true)
        {
            costIncrease += .8;
        }
    }
}

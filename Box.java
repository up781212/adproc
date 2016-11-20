/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxcompany;

/**
 *
 * @author Hex
 */
public class Box {
    protected int width;
    protected int length;
    protected int height;
    protected int area; 
    protected int grade;
    protected int noColors;
    protected boolean reinforcedB;
    protected boolean reinforcedC;
    protected boolean sealable;
    protected int type;
    protected double costIncrease;
    protected double cost;
    
    public Box(int bWidth, int bLength, int bHeight, int grade,int noBColors, 
                boolean bReinforcedB, boolean bReinforcedC,boolean bSealable,int type){
        setWidth(bWidth);
        setLength(bLength);
        setHeight(bHeight);
        setArea();
        
    }
    
    public int getWidth(){
        return width;
    }
    
    private void setWidth(int iWidth){
        width = checkSide(iWidth, "width");
    }
      
    public int getLength(){
        return length;
    }
    
    private void setLength(int iLength){
        length = checkSide(iLength, "Length");
    }
  
    public int getHeight(){
        return height;
    }
     
    private void setHeight(int iHeight){
        height = checkSide(iHeight, "height");
    }
    
    private int checkSide(int cValue,String side){
        while(cValue <100 || cValue>2000){
            System.out.println("Unfortunatly the minimum " + side + " of box is 100mm and the maxiumum is 2000mm.\nPlease input the " +side + " of the box you wish us to produce");
            cValue=200;
        }
        return cValue;
    }
    
    public int getArea(){
        return area;
    }
    
    private void setArea(){
        int subTotal = width *height *2;
        subTotal += height * length *2;
        subTotal += length * width *2;
    }
        
    public int getNoColors(){
        return noColors;
    }
    
    private void setNoColors(){
        
    }
    
    private int checkNoColors(int check){
        return check;
    }
    
    public boolean geReinforcedB(){
        return reinforcedB;
    }
    
    private void setReinforcedB(){
        
    }
    
    private int checkReinforcedB(int check){
        return check;
    }
    
    public boolean getReinforcedC(){
        return reinforcedC;
    }
    
    private void setReinforcedC(){
        
    }
    
    private int checkReinforcedC(int check){
        return check;
    }
}

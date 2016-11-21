/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


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
    protected int noColours;
    protected boolean reinforcedB;
    protected boolean reinforcedC;
    protected boolean sealable;
    protected int type;
    protected double costIncrease;
    protected double cost;
    
    private boolean boxOK; //possible way of removing old objects

    public Box(int bWidth, int bLength, int bHeight, int grade,int noBColors,
                boolean bReinforcedB, boolean bReinforcedC,boolean bSealable,int type){
        setWidth(bWidth);
        setLength(bLength);
        setHeight(bHeight);
        setArea();

    }
    
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
        boxOK = true;
    }

    public int getWidth(){
        return width;
    }

    private void setWidth(int iWidth){
        if(checkSide(iWidth)) width = iWidth;
    }

    public int getLength(){
        return length;
    }

    private void setLength(int iLength){
        if(checkSide(iLength)) length = iLength;
    }

    public int getHeight(){
        return height;
    }

    private void setHeight(int iHeight){
        if(checkSide(iHeight)) height = iHeight;
    }
    
    private boolean checkSide(int cValue){
        boolean clear = true;
        if(cValue < 100){
            UI.jFrame.error("The box is too small. Boxes must be between 100cm and 2000cm");
            boxOK = clear = false;
        }
        if(cValue > 2000){
             UI.jFrame.error("The box is too big. Boxes must be between 100cm and 2000cm");
             boxOK = clear = false;
         }
        return clear;
    }
    
    public void setGrade(int grd){
        if (grd < 1 || grd > 5){
            UI.jFrame.error("The grade is invalid. Grade are whole numbers from 1 to 5.");
        }
    }
    public int getGrade(){
        return grade;
    }

    public int getArea(){
        return area;
    }

    private void setArea(){
        int subTotal = width *height *2;
        subTotal += height * length *2;
        subTotal += length * width *2;
    }

    public int getNoColours(){
        return noColours;
    }

    private void setNoColours(int colours){
        if(colours < 0 || colours >2){
            UI.jFrame.error("The colour selected was invalid. Please select a colour option.");
        }
    }

    private int checkNoColors(int check){
        return check;
    }

    public boolean getReinforcedB(){
        return reinforcedB;
    }

    private void setReinforcedB(boolean reinforced){
        reinforcedB = reinforced;
    }

    private int checkReinforcedB(int check){
        return check;
    }

    public boolean getReinforcedC(){
        return reinforcedC;
    }

    private void setReinforcedC(boolean reinforced){
        reinforcedC = reinforced;
    }

    private int checkReinforcedC(int check){
        return check;
    }
    
    public boolean getSealable(){
        return sealable;
    }
    public void setSealable(boolean seal){
        sealable = seal;
    }
    
    public boolean getBoxOK(){
        return boxOK;
    }
        //provides points for each extra feature of the box. 
    public int checkBox(){
        int score = 0;
        score = getNoColours() + 1; //gives up to 3 points
        if(getReinforcedB()) score++; 
        if(getReinforcedC()) score++;
        
        //check if the grade is valid
        boxOK = testGrade(score);
        return score;
    }
    
    public boolean testGrade(int score){
        //BLARGGHHHHHH IM A BIG BRUTE OF A TEST PLEASE FIX ME
        if (grade < score+3){
            if(reinforcedC && grade > 3)return true;
            else if (grade > 2)return true;
            if(grade == score) return true;
        }
        return false;
    }
}

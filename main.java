package main;

import UI.jFrame;
import javax.swing.*;

public class main {
    public static void main (String[] args){
        setNativeFrame();
        
        jFrame aFrame = new jFrame();
        aFrame.setTitle("A frame");
        
        aFrame.setVisible(true);
        
        
        boolean makingBox = true;
                
        Box box = new Box();//add bits to get box from UI

        while(makingBox){
            int score = box.checkBox();
            makeBox(box, score);
            score = box.checkBox();

            UI.jFrame.error(box.getGrade() + " " + score + " " + box.getBoxOK());
            if (box.getBoxOK()){ //boolean to check for issues with box upon creation and edit
              makingBox = false;
            }
            else UI.jFrame.error("box grade is incorrect");
            box.setGrade(3);
        }
    }
    

    public static Box makeBox(Box box, int score){
        switch (score){
            case 1:
                 box  = new BoxT1(box.getWidth(), box.getLength(), box.getHeight(), box.getGrade(), box.getSealable());
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
            default:
                box = new Box();
                                 UI.jFrame.error("you made it to default! This box isn't valid!");
                break;
        }
        return box;
    }
    
    public static void setNativeFrame(){
                //set Native
        try {
            // Set System L&F
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName());
            } 
            catch (UnsupportedLookAndFeelException e) {
            // handle exception
            }
            catch (ClassNotFoundException e) {
            // handle exception
            }
            catch (InstantiationException e) {
            // handle exception
            }
            catch (IllegalAccessException e) {
            // handle exception
        }
    }
}

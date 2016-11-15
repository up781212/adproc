package UI;

import javax.swing.*;


public class main {
    public static void main (String[] args){
        setNativeFrame();
        
        jFrame aFrame = new jFrame();
        aFrame.setTitle("A frame");
        
        aFrame.setVisible(true);
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

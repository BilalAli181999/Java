
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import static javafx.scene.text.Font.font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fasiha Asim
 */
public class ScoreCard {
    BallCtrl ctrl;
    
    JFrame frame;
    JTextArea scr1,scr2,s3,s4;
    JPanel display;
   
    public ScoreCard( BallCtrl c)
    {
       
        frame=new JFrame();
        
        scr1 = new JTextArea(""); //comewhere in constructor etc...
        scr2 = new JTextArea("");
        s3 = new JTextArea("Palyer-1"); //comewhere in constructor etc...
        s4 = new JTextArea("Player-2");

        
 ctrl=new BallCtrl(this);
       scr1.setText(Integer.toString(ctrl.score1)+"");
      
        scr2.setText(Integer.toString(ctrl.score2)+"");
      
        display=new JPanel(new GridLayout(2,2));
        display.add(s3);
        display.add(s4);
        display.add(scr1);
        display.add(scr2);
        frame.add(display);
        
//        frame.setSize(100,100);
//        frame.setLocation(100,150);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);

    }
}

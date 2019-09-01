


import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fasiha Asim
 */
public class GameArena {
    JFrame fr;
    
    BallView ball ;
    BallCtrl bvctrl;
    BarView bar;
    ScoreCard scoring;
   

    public GameArena()
    {
        initGUI();
    }
    public void initGUI()
    {
        
        fr=new JFrame();
     
     
        ball=new BallView();
        bar=new BarView();
       
        bvctrl=new BallCtrl(this.ball);
        scoring=new ScoreCard(bvctrl);

         fr.addKeyListener(bvctrl);
       
    
        fr.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        fr.add(bar);
        fr.add(ball);
        fr.setSize(500,500);
        fr.setLocation(300,150);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        Thread t=new Thread(bvctrl);
         
        t.start();
        
    }

   
}


import javax.swing.JFrame;

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
    BallCtrl hnd;
    BallView ball ;

    public GameArena()
    {
        initGUI();
    }
    public void initGUI()
    {
        fr=new JFrame();
        ball=new BallView();
        hnd=new BallCtrl(this.ball);
        
        fr.addKeyListener(hnd);
        fr.add(ball);
        fr.setSize(500,500);
        fr.setLocation(300,300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        
    }

   
}

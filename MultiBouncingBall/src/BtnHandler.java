
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
public class BtnHandler  implements ActionListener{
  JFrame frm;
    
    
    BallView ball ;
    BallCtrl bvctrl;
    GameArena refg;
    int i=1;
    public BtnHandler(GameArena gg)
    {
        refg=gg;
        
        frm=new JFrame();
        
        
      frm.setExtendedState(JFrame.MAXIMIZED_BOTH);
         frm.setSize(500,500);
        frm.setLocation(300,150);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
         
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         
       
        
        System.out.println("Added");
         ball=new BallView();
         bvctrl=new BallCtrl(this.ball);
        Thread t=new Thread(bvctrl);
        t.start();
        frm.add(this.ball);
        
      
        
        
        
       
       
    }
    
}

import java.awt.FlowLayout;
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
public class GameArena {
    JFrame fr;
    BtnHandler hnd;
    JButton btn;
    public GameArena()
    {
       
        initGUI();
    }
    public void initGUI()
    {
       
        fr=new JFrame();
        fr.setLayout(new FlowLayout());
        
       hnd = new BtnHandler(this);
        btn  = new JButton("Add Ball");
        btn.addActionListener(hnd);
        
    //   fr.addKeyListener(hnd);
        fr.setAlwaysOnTop(true);
        fr.add(btn);
        fr.setSize(200,200);
        fr.setLocation(100,100);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
       
        
    }

   
}

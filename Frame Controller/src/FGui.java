
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Afzal Ali
 */
public class FGui 
{
    JFrame fr;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    
    FBtnHnd1 hnd1;
    FBtnHnd2 hnd2;
    FBtnHnd3 hnd3;
    FBtnHnd4 hnd4;
    public FGui() 
    {
    
        initGUI();
    }
    public void initGUI()
    {
        
        fr = new JFrame("MY First GUI");
       // FlowLayout fl = new FlowLayout();
        //fr.setLayout(fl);
        Container c=fr.getContentPane();
        c.setLayout(new GridLayout(2,2));
        
        hnd1 = new FBtnHnd1(this);
        btn1  = new JButton("UP");
        btn1.addActionListener(hnd1);
        fr.add(btn1);
        hnd2 = new FBtnHnd2(this);
        btn2  = new JButton("RIGHT");
        btn2.addActionListener(hnd2);
        fr.add(btn2);
        hnd3 = new FBtnHnd3(this);
        btn3  = new JButton("LEFT");
        btn3.addActionListener(hnd3);
        fr.add(btn3);
        hnd4 = new FBtnHnd4(this);
        btn4  = new JButton("DOWN");
        btn4.addActionListener(hnd4);
        fr.add(btn4);
       
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("height " + d.height);
        System.out.println("width " + d.width);
         fr.setSize(200,200);
        int x = ((int)((d.width+fr.getWidth())%(Math.random()*1000)));
        int y = ((int)((d.height+fr.getHeight())%(Math.random()*1000)));
        System.out.print("initial dimensions");
        System.out.println("x :"+x);
        System.out.println("y :"+y);
        
       
        //fr.setLocation(300,200);
        fr.setLocation(x,y);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        
    }
    
}

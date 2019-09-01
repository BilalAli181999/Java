
import java.awt.Dimension;
import java.awt.FlowLayout;
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
public class GUI 
{
    JFrame fr;
    JButton btn;
    BtnHnd hnd;
    public GUI() 
    {
    
        initGUI();
    }
    public void initGUI()
    {
        
        fr = new JFrame("MY First GUI");
        FlowLayout fl = new FlowLayout();
        fr.setLayout(fl);
        hnd = new BtnHnd(this);
        
        btn  = new JButton("Click Me");
        btn.addActionListener(hnd);
        
        
        fr.add(btn);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("height " + d.height);
        System.out.println("width " + d.width);
        
        int x = ((int) (Math.random()*1000)%d.width);
        int y = ((int) (Math.random()*1000)%d.height);
        
        
        fr.setSize(200,200);
        //fr.setLocation(300,200);
        fr.setLocation(x,y);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        
    }
    
}


import java.awt.FlowLayout;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fasiha Asim
 */
public final class GUI {
    JFrame fr;
    JButton  btn_r,btn_l;
    JTextField tf;
    BtnHnd hnd;
    public GUI() throws IOException
    {
        initGUI();
    }
    public void initGUI() throws IOException
    {
        hnd=new BtnHnd(this);
        fr=new JFrame("Reading File");
        fr.setLayout(new FlowLayout());
              tf=new JTextField(30);
              btn_l=new JButton("<");
               btn_r=new JButton(">");
               btn_l.setEnabled(false);
               fr.add(btn_l);
               fr.add(btn_r);
               fr.add(tf);
               btn_l.addActionListener(hnd);
                btn_r.addActionListener(hnd);
                btn_l.setActionCommand("back");
                 btn_r.setActionCommand("forward");
               fr.setSize(250,200);
               fr.setLocation(200,200);
               fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               fr.setVisible(true);
               
              
    }
}

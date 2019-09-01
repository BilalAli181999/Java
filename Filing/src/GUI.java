
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anzar Ahmad
 */
public class GUI{
    JFrame fr;
    JButton btnw,btnr;
    JTextField tfr,tfw;
    JLabel lbr,lbw;
    BtnHandler hnd;
    
    
    public GUI() {
        initGUI();
    }
public void initGUI()
{
    fr = new JFrame("file man");
    fr.setLayout(new FlowLayout());
    
    hnd = new BtnHandler(this);
    
    lbr = new JLabel("Read");
    lbw = new JLabel("Write");
    
    tfr = new JTextField(25);
    tfw = new JTextField(25);
    
    btnr = new JButton("read from file");btnr.setActionCommand("1");
    btnw = new JButton("write to file");btnw.setActionCommand("2");
    
    btnr.addActionListener(hnd);
    btnw.addActionListener(hnd);
    
    fr.add(lbr);
    fr.add(tfr);
    fr.add(btnr);
    fr.add(lbw);
    fr.add(tfw);
    fr.add(btnw);
    
    fr.setSize(200,300);
    fr.setLocation(300,200);
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fr.setVisible(true);
    
}
     
    
}


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bilal Ali
 */
public class GUI {
    JPanel display;
    JFrame fr;
    JPanel panelButtons;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bSub,bMul,bDiv,bEqu,bPoint,bClear,bBack,bNeg,bSqr,bMod,bFr,bm1,bm2,bm3,bm4,bm5,bCE;
    JTextField screen,scr,head;
    BtnHnd hnd;
    public GUI()
    {
        initGUI();
    }
    public void initGUI()
    {
        int i, x_axis = 10, y_axis = 45, width = 300, height = 25;
        fr=new JFrame("Calculator");
    
        display=new JPanel(new GridLayout(3,1));
        screen=new JTextField(20);
        scr=new JTextField(20);
        head=new JTextField(20);
        
        head.setBounds(5, 10, 300, 30);
        head.setEditable(false);
        head.setBorder(BorderFactory.createEmptyBorder());
        head.setEditable(false);
        head.setFont(new Font("Segoe UI Historic", Font.PLAIN, 20));
        head.setText("Standard");
        head.setFocusable(false);

        scr.setBounds(x_axis, y_axis, width, height);
        scr.setEditable(false);
        scr.setFocusable(false);
        scr.setHorizontalAlignment(JTextField.RIGHT);
        scr.setBorder(BorderFactory.createEmptyBorder());
        scr.setFont(new Font("Segoe UI Historic", Font.PLAIN, 20));
        
        screen.setBounds(x_axis, y_axis + height, width, height + 45);
        screen.setText("0");
        screen.setFocusable(false);
        screen.setEditable(false);
        screen.setHorizontalAlignment(JTextField.RIGHT);
        screen.setBorder(BorderFactory.createEmptyBorder());
        screen.setFont(new Font("Segoe UI Historic", Font.BOLD, 20));
        screen.setText("");
        display.add(head);
        display.add(scr);
        display.add(screen);
     
     
        hnd=new BtnHnd(this);
       
        panelButtons=new JPanel(new GridLayout(7,4));//5 row 4 col
        
       
        
       
        fr.add(display, BorderLayout.NORTH);
     
        
       
        fr.setLocation(500,100);
        fr.setSize(336,538);
       
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bCE=new JButton("CE");
        bm1=new JButton("MC");
        bm2=new JButton("MR");
        bm3=new JButton("M+");
        bm4=new JButton("M-");
        bm5=new JButton("MS");
        bSqr=new JButton("Sqrt");
        bMod=new JButton("%");
        bFr=new JButton("1/x");
        bNeg=new JButton("Neg");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        bDiv=new JButton("/");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        bMul=new JButton("*");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        bAdd=new JButton("+");
        bClear=new JButton("C");
        b0=new JButton("0");
        bEqu=new JButton("=");
        bSub=new JButton("-");
        bPoint=new JButton(".");
        bBack=new JButton("<<");
       
         b0.setBackground(Color.LIGHT_GRAY);
         b1.setBackground(Color.LIGHT_GRAY);
          b2.setBackground(Color.LIGHT_GRAY);
           b3.setBackground(Color.LIGHT_GRAY);
            b4.setBackground(Color.LIGHT_GRAY);
             b5.setBackground(Color.LIGHT_GRAY);
        b6.setBackground(Color.LIGHT_GRAY);
         b7.setBackground(Color.LIGHT_GRAY);
        b8.setBackground(Color.LIGHT_GRAY);
        b9.setBackground(Color.LIGHT_GRAY);
        
        bAdd.setBackground(Color.WHITE);
        bSub.setBackground(Color.WHITE);
        bMul.setBackground(Color.WHITE);
        bDiv.setBackground(Color.WHITE);
        bSqr.setBackground(Color.WHITE);
        bMod.setBackground(Color.WHITE);
        bFr.setBackground(Color.WHITE);
        bm1.setBackground(Color.WHITE);
        bm2.setBackground(Color.WHITE);
        bm3.setBackground(Color.WHITE);
        bm4.setBackground(Color.WHITE);
        bm5.setBackground(Color.WHITE);
         bClear.setBackground(Color.WHITE);
        bCE.setBackground(Color.WHITE);
        bBack.setBackground(Color.WHITE);
        bPoint.setBackground(Color.WHITE);
        bEqu.setBackground(Color.WHITE);
        bNeg.setBackground(Color.WHITE);
        
        
          
       
            
         
      //  bEqu.setBackground(Color.white);
        panelButtons.add(b7);
        panelButtons.add(b8);
        panelButtons.add(b9);
        panelButtons.add(bDiv);
        panelButtons.add(b4);
        panelButtons.add(b5);
        panelButtons.add(b6);
        panelButtons.add(bMul);
        panelButtons.add(b1);
        panelButtons.add(b2);
        panelButtons.add(b3);
        panelButtons.add(bAdd);
        panelButtons.add(bClear);
        panelButtons.add(b0);
        panelButtons.add(bEqu);
        panelButtons.add(bSub);
        panelButtons.add(bBack);
        panelButtons.add(bPoint);
        panelButtons.add(bNeg);
        panelButtons.add(bMod);
        panelButtons.add(bCE);
        panelButtons.add(bFr);
        panelButtons.add(bSqr);
        panelButtons.add(bm1);
        panelButtons.add(bm2);
        panelButtons.add(bm3);
        panelButtons.add(bm4);
        panelButtons.add(bm5);
        
        bEqu.setEnabled(false);
        bm1.setEnabled(false); 
        bm2.setEnabled(false); 
        bAdd.setEnabled(false);
        bMul.setEnabled(false);
        bSub.setEnabled(false);
        bDiv.setEnabled(false); 
        bSqr.setEnabled(false);
        bMod.setEnabled(false);
        bNeg.setEnabled(false);
        bFr.setEnabled(false);
        bm3.setEnabled(false);
        bm4.setEnabled(false);
        bm5.setEnabled(false);
       
        
        
        b7.addActionListener(hnd);
        b8.addActionListener(hnd);
        b9.addActionListener(hnd);
        bDiv.addActionListener(hnd);
        b4.addActionListener(hnd);
        b5.addActionListener(hnd);
        b6.addActionListener(hnd);
        bMul.addActionListener(hnd);
        b1.addActionListener(hnd);
        b2.addActionListener(hnd);
        b3.addActionListener(hnd);
        bAdd.addActionListener(hnd);
        bClear.addActionListener(hnd);
        b0.addActionListener(hnd);
        bEqu.addActionListener(hnd);
        bSub.addActionListener(hnd);
        bPoint.addActionListener(hnd);
        bBack.addActionListener(hnd);
        bNeg.addActionListener(hnd);
        bSqr.addActionListener(hnd);
        bMod.addActionListener(hnd);
        bFr.addActionListener(hnd);
        bm1.addActionListener(hnd);
        bm2.addActionListener(hnd);
        bm3.addActionListener(hnd);
        bm4.addActionListener(hnd);
        bm5.addActionListener(hnd);
        bCE.addActionListener(hnd);
    
        
        fr.add(panelButtons);
   
        
         fr.setVisible(true);
    }
    
    
}


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JComponent;
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
public class BallView extends JComponent{
    Ball bpos;
    int x; 
    int y;
    public BallView()
    {
         Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Ball View");
      x = ((int)((d.width)%(Math.random()*1000)));
      y = ((int)((d.height)%(Math.random()*1000)));
        bpos=new Ball(x,y);
        
         System.out.println("New Ball: "+bpos.x+"|"+bpos.y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.

   g.setColor(Color.orange);
   g.fillOval(bpos.x,bpos.y , 30,30);  
}}

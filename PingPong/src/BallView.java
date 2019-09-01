
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fasiha Asim
 */
public class BallView extends JPanel{
    BallCtrl bctrl;
    Ball bpos;
    Bar brpos1;
    Bar brpos2;
    String scr1="0",scr2="0";
    public BallView()
    {
        int x = ((int)(Math.random()*1000));
        int y = ((int)(Math.random()*1000));
     
        bpos=new Ball(x,y);
        brpos1=new Bar(100,100);
        brpos2=new Bar(1200,500);
    }
    public void setScore1(int s1)
    {
        if(s1<0)
            return;
        else
            scr1=Integer.toString(s1);
    }
    public void setScore2(int s2)
    {
        if(s2<0)
            return;
        else
            scr2=Integer.toString(s2);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
       final BufferedImage img;
        try {
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            img = ImageIO.read(new File("C:\\Users\\Fasiha Asim\\Documents\\NetBeansProjects\\PingPong\\court.png"));
            
             g.drawImage(img, WIDTH, WIDTH, d.width,d.height, this);
             g.setColor(Color.green);
       
        g.fillOval(bpos.x,bpos.y , 30, 30);
         g.setColor(Color.yellow);
        g.fillRect(brpos1.getx(),brpos1.gety(),10,150);
         g.setColor(Color.red);
       g.fillRect(brpos2.getx(),brpos2.gety(), 10, 150);
        } catch (IOException ex) {
            Logger.getLogger(BallView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        g.drawString("Player-1 : "+scr1,500,50);
        g.drawString("Player-2 : "+scr2,800,50);

      
 
     
       
    
   }
    
}

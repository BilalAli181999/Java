
import java.awt.Color;
import java.awt.Graphics;
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
public class BarView extends JPanel{
    Bar brpos1;
    Bar brpos2;
    public BarView()
    {
        brpos1=new Bar(100,100);
        brpos2=new Bar(1200,500);
    }
    @Override
     protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.green);
       g.fillRect(brpos1.getx(),brpos1.gety(),20,100);
       g.fillRect(brpos2.getx(),brpos2.gety(), 20, 100);
        
    }
}


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
public class BallView extends JPanel{
    Ball bpos;
    public BallView()
    {
        bpos=new Ball(20,30);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.blue);
        g.fillOval(bpos.x,bpos.y , 30, 30);
    }
    
}

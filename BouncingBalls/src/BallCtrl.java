
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fasiha Asim
 */
public class BallCtrl implements KeyListener{
    BallView refbv;
    public BallCtrl(BallView bv)
    {
        refbv=bv;
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        switch(e.getKeyCode())
        {
            //up
            case 30:
            {
                refbv.bpos.sety(refbv.bpos.gety()-5);
                refbv.repaint();
                break;
            }
            //down
            case 40:
            {
             refbv.bpos.sety(refbv.bpos.gety()+5);
                refbv.repaint();
            break;}
            //right
             case 39:
            {
             refbv.bpos.setx(refbv.bpos.getx()+5);
                refbv.repaint();
            break;}
            //left
             case 37:
            {
             refbv.bpos.setx(refbv.bpos.getx()-5);
                refbv.repaint();
            break;}
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}

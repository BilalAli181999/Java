
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fasiha Asim
 */
public class BallCtrl implements Runnable{
    
    BallView ball;
    int minX,minY,maxY,maxX;
    Dimension screen;
    int xSpeed=1,ySpeed=1;
    int screenWidth,screenHeight;
    boolean up=false,down=true,right=true,left=false;
    public BallCtrl(BallView b)
            {
                System.out.println("Controller");
               this.ball=b;
               screen= Toolkit.getDefaultToolkit().getScreenSize();
               screenWidth=(int)screen.getWidth();
               screenHeight=(int)screen.getHeight();
               maxY=screenHeight-100;
               minY=20;//ball size=20
               maxX=screenWidth-30;
               minX=0;
            }

    @Override
    public void run() {
       while(true)
       {
           if(down)
           {
               if(ball.bpos.gety()>=maxY)
               {
                   ySpeed=-ySpeed;
                   down=false;
                   up=true;
               }
           }
          
           if(up)
           {
               if(ball.bpos.gety()<=minY)
               {
                   ySpeed=-ySpeed;
                   down=true;
                   up=false;
               }
           }
             if(right)
           {
               if(ball.bpos.getx()>=maxX)
               {
                   xSpeed=-xSpeed;
                   right=false;
                   left=true;
               }
           }
          
           if(left)
           {
               if(ball.bpos.getx()<=minX)
               {
                   xSpeed=-xSpeed;
                   right=true;
                   left=false;
               }
           }
           ball.bpos.sety(ball.bpos.gety()+ySpeed);
           ball.bpos.setx(ball.bpos.getx()+xSpeed);
           ball.repaint();
           ball.revalidate();
           try {
               Thread.sleep(1);
           } catch (InterruptedException ex) {
               Logger.getLogger(BallCtrl.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
}

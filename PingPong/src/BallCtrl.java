
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
public class BallCtrl  implements Runnable,KeyListener{
    BallView ball;
    int score1=0,score2=0;
   ScoreCard score;
    int minX,minY,maxY,maxX;
    Dimension screen;
    int xSpeed=1,ySpeed=1;
    int screenWidth,screenHeight;
    boolean up=false,down=true,right=true,left=false;
    
    
    
    public BallCtrl(BallView b)
            {
                
               this.ball=b;
               
               screen= Toolkit.getDefaultToolkit().getScreenSize();
               screenWidth=(int)screen.getWidth();
               screenHeight=(int)screen.getHeight();
               maxY=screenHeight-100;
               minY=20;//ball size=20
               maxX=screenWidth-30;
               minX=0;
            }
     public BallCtrl(ScoreCard s)
     {
         System.out.println("const");
         score=s;
     }

    /**
     *
     */
    public void checkCollision()
    {
       
        if(ball.bpos.getx()==ball.brpos1.getx()+15)
        {
          //  System.out.println("Bar-y:"+(ball.brpos1.gety())+"-"+(ball.brpos1.gety()+165)+"Ball-y:"+(ball.bpos.gety()));
            if(ball.bpos.gety()+30>=ball.brpos1.gety()-15 && ball.bpos.gety()<=ball.brpos1.gety()+165 )
            {
              
                xSpeed=-xSpeed;
               
                System.out.println("Collision from left paddle");
            }
        }
         if(ball.bpos.getx()+30==ball.brpos2.getx())
        {
    //  System.out.println("Bar-y:"+(ball.brpos2.gety())+"-"+(ball.brpos2.gety()+165)+"Ball-y:"+(ball.bpos.gety()));
            if(ball.bpos.gety()+30>=ball.brpos2.gety()-15 && ball.bpos.gety()<=ball.brpos2.gety()+165 )
            {
               
                xSpeed=-xSpeed;
                
                 System.out.println("Collision from right paddle");
            }
        }
    }
    public void checkBoundry()
    {
        if(((ball.bpos.getx())<(ball.brpos1.getx()-30)) && ball.bpos.getx()==minX)
        {
            
           
          score2++;
          ball.setScore2(score2);
      //    String s=Integer.toString(score2);
      //      score.scr1.setText(Integer.toString(score2));
        //    System.out.println(s);
      
             System.out.println("score2: "+score2);
             xSpeed=-xSpeed;
             ball.bpos.setx(maxX/2);
             ball.bpos.sety(maxY/2);
            
        }
         if(((ball.bpos.getx())>ball.brpos2.getx()+30) && ball.bpos.getx()==maxX)
        {
            
            
            score1++;
            ball.setScore1(score1);
       //     score.scr1.setText(Integer.toString(score1));
      
            System.out.println("score1: "+score1);
              xSpeed=-xSpeed;
             ball.bpos.setx(maxX/2);
             ball.bpos.sety(maxY/2);
        }
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
           checkCollision();
           checkBoundry();
           ball.bpos.sety(ball.bpos.gety()+ySpeed);
           ball.bpos.setx(ball.bpos.getx()+xSpeed);
           ball.repaint();
           ball.revalidate();
           
           try {
               Thread.sleep(2);
           } catch (InterruptedException ex) {
               Logger.getLogger(BallCtrl.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }

   

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        //up-38 down-40
        switch(e.getKeyCode())
        {
             case 81:
            {
                if(ball.brpos1.gety()>20)
                { ball.brpos1.sety((ball.brpos1.gety())-50);}
                ball.repaint();
                break;
            }
            case 65:
            {
                if(ball.brpos1.gety()<screenHeight-220)
                { ball.brpos1.sety((ball.brpos1.gety())+50);}
                ball.repaint();
                break;
            }

            case 38:
            {
                if(ball.brpos2.gety()>20)
                { ball.brpos2.sety(ball.brpos2.gety()-50);}
                ball.repaint();
                break;
            }
            case 40:
            {
                if(ball.brpos2.gety()<screenHeight-220)
                { ball.brpos2.sety(ball.brpos2.gety()+50);}
                ball.repaint();
                break;
            }
            
            }
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }

   
}

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Afzal Ali
 */
public class FBtnHnd4 implements ActionListener
{
FGui refg;
Rectangle r ;
 int x;
        int y;
    public FBtnHnd4(FGui gg) 
    {
    refg = gg;
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
          x=refg.fr.getLocation().x;
    y=refg.fr.getLocation().y;
      //  System.out.print("initial dimensions btn1");
       // System.out.println("x :"+x);
        //System.out.println("y :"+y);
      //  System.out.println(x);
        y=y+10;
        refg.fr.setLocation(x,y);
      //   System.out.print("btn4 after dimensions");
       // System.out.println("x :"+x);
       // System.out.println("y :"+y);
        //System.out.println(x);
    }
    
}

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
public class FBtnHnd1 implements ActionListener
{
FGui refg;

 int x;
        int y;
    public FBtnHnd1(FGui gg) 
    {
    refg = gg;
   
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
         
    x=refg.fr.getLocation().x;
    y=refg.fr.getLocation().y;
    y=y-10;
        refg.fr.setLocation(x,y);
       
    }
    
}

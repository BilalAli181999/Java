
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
public class BtnHnd implements ActionListener
{
GUI refg;

    public BtnHnd(GUI gg) {
    refg = gg;
    }
    
int x =10;
    @Override
    public void actionPerformed(ActionEvent e) {
        x = x + 10;
        System.out.println(x);
        refg.fr.setTitle("my new title "+x);
    }
    
}

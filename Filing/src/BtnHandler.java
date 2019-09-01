
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anzar Ahmad
 */
public class BtnHandler implements ActionListener{
GUI refg;

    public BtnHandler(GUI gg) {
        refg = gg;
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        
        switch (ae.getActionCommand())
        {
            case "1":{
            try {
                File f = new File("file.file");
                FileReader fr = new FileReader(f);
                try (BufferedReader br = new BufferedReader(fr)) {
                    String data = br.readLine();
                    while(data!=null)
                    {
                        System.out.println(data);
                        data = br.readLine();
                    }
                }
                
            } catch (IOException ex) {
                Logger.getLogger(BtnHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
                break;}
            case "2":{
            try {
                File f = new File("file.file");
                FileWriter fw = new FileWriter(f,true);
                try (PrintWriter pw = new PrintWriter(fw)) {
                    String data = refg.tfw.getText();
                    pw.println(data);
                }
                
                
            } catch (IOException ex) {
            }
                
                break;}
            
        }
    }
    
}

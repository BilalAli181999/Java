
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
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
public final class BtnHnd implements ActionListener {
GUI refg;
Stack back,forward;
public BtnHnd(GUI gg) throws IOException
{
    refg=gg;
    back=new Stack();
    forward=new Stack();
    try {
        readMyFile();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(BtnHnd.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    @Override
    public void actionPerformed(ActionEvent e) {
      switch(e.getActionCommand())
      {
          case "forward":
          {
              if(!refg.btn_l.isEnabled())
              {
                  refg.btn_l.setEnabled(true);
              }
              if(!(refg.tf.getText()==null))
              {
                  this.forward.push(refg.tf.getText());
              }
              refg.tf.setText((String)this.back.pop());
              
              if(this.back.isEmpty())
              {
                  refg.btn_r.setEnabled(false);
              }
              break;
          }
          case "back":
          {
              if(!refg.btn_r.isEnabled())
              {
                  refg.btn_r.setEnabled(true);
              }
              this.back.push(refg.tf.getText());
              refg.tf.setText((String)this.forward.pop());
              if (this.forward.isEmpty())
              {
                  refg.btn_l.setEnabled(true);
              }
              break;
          }
      }
       
    }

    public void readMyFile() throws FileNotFoundException, IOException {
        File f=new File("rec.rec");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        String line;
    line = br.readLine();
    while(line!=null)
    {
        this.forward.push(line);
        line=br.readLine();
    }
    while(!this.forward.isEmpty())
    {
        String rec=(String)this.forward.pop();
        this.back.push(rec);
    }
        
        
        
        
    }
    
}

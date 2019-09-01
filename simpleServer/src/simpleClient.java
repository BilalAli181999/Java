
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
public class simpleClient {
    private Socket s = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;
    
    public simpleClient()
    {
        try {
            s = new Socket("127.0.0.1",5555);
            //read fro keyboard...
            in = new DataInputStream(System.in);
            
            out= new DataOutputStream((s.getOutputStream()));
            
            String line="";
            while(!line.equalsIgnoreCase("quit"))
            {
                line=in.readLine();
                
                out.writeUTF(line);
            }
            s.close();
            in.close();
            out.close();
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        simpleClient client = new simpleClient();
    }
    
}


import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
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
public class simpleServer {
    
    private ServerSocket ss=null;
    private Socket s=null;
    private DataInputStream in= null;

    public simpleServer() {
        try {
            ss = new ServerSocket(5555);
        //    System.out.println(ss.getLocalPort());
            System.out.println("server ready");
            s=ss.accept();
            in= new DataInputStream(new BufferedInputStream(s.getInputStream()));
            
            String line ="";
            while(!line.equalsIgnoreCase("quit"))
            {
                line = in.readUTF();
                System.out.println(line);
            }
            
            in.close();
            s.close();
            ss.close();
            
        } catch (Exception ex) {
        }
    
    }
    public static void main(String[] args) {
        simpleServer simple = new simpleServer();
       
                
    }
    
    
}

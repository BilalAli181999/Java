
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.Marshaller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anzar Ahmad
 */
public class MultiThServer {

    //private ServerSocket Ears = null;
    
    public static void main(String[] args) {
        
        try (ServerSocket Ears = new ServerSocket(4444)){
            System.out.println("Server Ready at ... 4444");
            
            ExecutorService pool = Executors.newFixedThreadPool(2);
            while(true)
            {
                pool.execute(new Server(Ears.accept()));
            }
            
        } catch (Exception ex) {ex.printStackTrace();}
    }
    public static class Server implements Runnable
    {
        private Socket s = null;

        public Server(Socket sss) {
            this.s = sss;
        }
        
        @Override
        public void run() {
            try {
               
                System.out.println("Connected: " + s);
                Scanner in = new Scanner(s.getInputStream());
                PrintWriter out = new PrintWriter(s.getOutputStream(),true);
                while(in.hasNextLine())
                {
//                    String line = in.nextLine();
//                    System.out.println(line);
                            
                out.println("Server Says .." +in.nextLine().toUpperCase());
                }
            } catch (Exception ex) {ex.printStackTrace();}
            finally{try {s.close();} 
                    catch (Exception ex) {ex.printStackTrace();}
                    }
            System.out.println("Connection Closed: .." + s);
        }
        
    
    }
}

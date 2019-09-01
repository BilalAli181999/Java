
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.transform.Scale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anzar Ahmad
 */
public class MultiThClient {

    private Socket s = null;
    
    public static void main(String[] args) {
        try(Socket s = new Socket("127.0.0.1", 4444)){
            Scanner scan = new Scanner(System.in);
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            Scanner in = new Scanner(s.getInputStream());
            
            while(scan.hasNextLine())
            {
                out.println(scan.nextLine());
                System.out.println(in.nextLine());
                
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}

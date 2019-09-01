/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fasiha Asim
 */
public class Driver {
    public static void main(String[] args)
    {
        RandomShower r1=new RandomShower();
        RandomShower r2=new RandomShower();
        RandomShower r3=new RandomShower();
        RandomShower r4=new RandomShower();
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r1);
        Thread t3=new Thread(r1);
        Thread t4=new Thread(r1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        System.out.println("hello");
    }
    
}

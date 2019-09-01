/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

/**
 *
 * @author Fasiha Asim
 */
public class Singleton {
    private static int count=0;
    private static Singleton s[]={null,null,null,null,null};
    private Singleton()
    {
         System.out.println("New");
    }
    public static Singleton getObj()
    {
        if(count<4)
        {
           Singleton ret=new Singleton();
           s[count]=ret;
           count++;
           return ret;
            
        }
        int n=(int) ((Math.random()*1000)%4);
        System.out.println("Old");
        return s[n];
    }
    
    
}


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
public class Driver {
  public static void main(String[] args) {
    ExecutorService pool = Executors.newFixedThreadPool(4);
    
    for( int i=0 ; i< 16; i++)
    {
      Runnable worker = new WorkerThread("" + i);
      pool.execute(worker);
    }
    
    pool.shutdown();
    while( !pool.isTerminated() ){}
    
    System.err.println("Ending all Threads ! With your life");
  }
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
public class WorkerThread implements Runnable{

  private String command;

  public WorkerThread(String c) {
    this.command = c;
  }
  
  
  
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName()+ " Started " + this.command);
    processComamnd();
      System.out.println(Thread.currentThread().getName()+ " Ended " + this.command);
  }

  @Override
  public String toString() {
    return this.command;
  }
  
  

  private void processComamnd() {
    try {
      Thread.sleep(5000);
    } catch (Exception ex) {
      ex.printStackTrace();
     }
    
  }
  
}

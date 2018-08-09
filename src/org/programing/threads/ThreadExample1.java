package org.programing.threads;

public class ThreadExample1 {
    
    public static void main(String[] args) {
        Thread1 thread=new Thread1();
      //  thread.run(1);
        thread.start();
        thread.start();
        
    
        for (int i=0;i <100 ;i++)
        {
            System.out.println("main" +i);
        }
        
        //thread.run(1);
    }
    
    

}


class Thread1 extends Thread
{
    @Override
    public void run() {
      for (int i=0;i <100;i++)
      {
          System.out.println("thread" +i);
      }
    }
    
    public void run(int j) {
        for (int i=0;i <100;i++)
        {
            System.out.println("thread run1" +i);
        }
      }
 
}

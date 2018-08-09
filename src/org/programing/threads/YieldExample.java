package org.programing.threads;

public class YieldExample {

    public static void main(String[] args) throws InterruptedException {
        
        YieldThread1.mt=Thread.currentThread();
        Thread thread1 = new Thread(new YieldThread2());
      //  Thread thread2 = new Thread(new YieldThread2());
        thread1.start();
        thread1.interrupt();
     
    //   Thread.currentThread().interrupt();
    //  thread1.join();
      // Thread.currentThread().interrupt();
     
      for(int i =0;i<10;i++)
      {
          Thread.sleep(1000);
          System.out.println(i);
      }

    }

}

class YieldThread1 extends Thread {
    static Thread mt;
      @Override
    public void run() {
        
     
        for (int i = 0; i < 10; i++) {
           
            System.out.println("Thread 1 :" + i);
        }
    }
}

class YieldThread2 implements Runnable {
     @Override
    public void run() {
       // Thread.yield();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(20);
                System.out.println("Thread 2 :" + i);
            } catch (InterruptedException e) {
                System.out.println("Interupted");
                // TODO Auto-generated catch block
                //e.printStackTrace();
            }
           
        }

    }

}
package org.programing.threads;

public class ThreadHeavyWeightProcess {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable(), "Thread1");
        Thread thread4 = new Thread(new MyRunnable(), "Thread4");
        Thread thread2 = new Thread(new MyRunnable1(), "Thread2");
        thread1.run();
        thread1.join();
        thread2.start();
        thread2.join();
       Thread thread3 =new MyThread("Thread3");
       Thread thread5 =new MyThread("Thread5");
       thread3.start();
       thread4.start();
       thread5.start();
      // thread5.start();
        
    }

}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("i =" + i + " Thread Name " + Thread.currentThread()
                    .getName());
        }

    }

}

class MyRunnable1 implements Runnable {
    
        @Override
        public void run() {
          for(int i=0;i<5;i++)
          {
              try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
              System.out.println("i =" + i + " Thread Name " + Thread.currentThread()
              .getName());
          }
         
}
        
}    
    class MyThread extends Thread
    {
        
       public MyThread(String name) {
            super(name);
        }

      
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("i =" + i + " Thread Name " + Thread.currentThread()
                        .getName());
            }

        }
        
        
    }
    



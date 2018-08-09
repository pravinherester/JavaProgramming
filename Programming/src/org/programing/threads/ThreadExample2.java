package org.programing.threads;

public class ThreadExample2 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread()
                .getName());
        ThreadRunable r = new ThreadRunable();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread();
        t1.start();
        t2.start();
      

        /*
         * for(int i=0;i<100;i++) { System.out.println("Executed by main thread");// TODO Auto-generated method stub }
         */

    }
}

class ThreadRunable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread()
                .getName());

        /*
         * for(int i=0;i<100;i++) { System.out.println("Executed by child thread");// TODO Auto-generated method stub }
         */

    }
}

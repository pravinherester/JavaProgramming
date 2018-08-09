package org.dummy;

public class MainChild implements Runnable {
    Thread t1;

    public MainChild(String a) {
        t1 = new Thread(this, a);
        t1.start();
    }

    public void run() {
        for (int x = 1; x <= 3; x++) {
            System.out.println(x + "  this thread is "
                    + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        MainChild mch = new MainChild("Child ");
        for (int x = 1; x <= 3; x++) {
            System.out.println(x + "  this thread is "
                    + Thread.currentThread().getName());
        }
    }
}
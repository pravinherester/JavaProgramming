package org.programing.threads;

public class MyDeadLock {
    
    String str1="test";
    String str2="test1";
    
   Thread t1=new Thread(){
       public void run() {
           while(true)
           {
               try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
           synchronized (str1) {
               
               synchronized (str2) {
                System.out.println(str1+str2);
            }
            
        }
           }
       };
       
   };
   
   
   
   Thread t2=new Thread(){
       public void run() {
           while(true)
           {
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   // TODO Auto-generated catch block
                   e.printStackTrace();
               }
           synchronized (str2) {
               
               synchronized (str1) {
                System.out.println(str1+str2);
            }
            
        }
           }
       };
       
   };
   
   public static void main(String[] args) {
        MyDeadLock deadlock=new MyDeadLock();
        deadlock.t1.start();
        deadlock.t2.start();
}

}

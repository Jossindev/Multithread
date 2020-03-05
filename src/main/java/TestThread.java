public class TestThread implements Runnable {
     Thread t;

     TestThread() {
         t = new Thread(this, "Demonstrate");
         System.out.println("Child class created " + t);
         t.start();
     }

     @Override
     public  void run() {
         try {
             for (int i = 0; i < 5; i++) {
                 System.out.println("Child Thread " + i);
                 Thread.sleep(100);
             }
         } catch (InterruptedException e ) {
             System.out.println("Child Thread interrupt ");
         }
         System.out.println("Child Thread  end " );
     }
}

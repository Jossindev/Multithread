public class Main {
    public static void main(String[] args) {

    new TestThread();

   try {
       for(int i =0;i<5;i++){
           System.out.println("Main Thread "+ i);
           Thread.sleep(100);
       }
   } catch (InterruptedException e){
       System.out.println("Main Thread Interrupt");
   }
        System.out.println("Main Thread end");

}
    }

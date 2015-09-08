Threads can be controlled and implemented in two ways, either using the MainThread or by using the Runnable Interface.

Lets first see how thread work when we use the main thread.

 ```
 class ThreadDemo {
  public static void main(String args[]) {
  
   Thread sc = Thread.currentThread(); 
   
   System.out.println("Current Thread is: " +sc);
   
   sc.setName("WatchOut");
   System.out.println("New Thread is: " +sc);
   
   try {
   for(int i=0; i<=10; i++) {
    System.out.println(i);
    Thread.sleep(5000);
   }
    } catch(InterruptedException ae) {
      System.out.println("Mainthread interrupted. Error message: " +ae);
    }
  }
} 
``` 


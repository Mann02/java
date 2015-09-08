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

So lets now talk about this program. First we made a class named ``ThreadDemo`` and then made our main method with ``public static void main(String args[])`` after that we made an object for our main thread. As you can see my object name is __sc__ and you can name the object anything you want. But what is ``currentthread();``? currentThread is the method for our Main thread which is usually used when we work with multithreading. So now we can use our object ``sc`` anywhere to call, rename or edit our thread. Next we printed text to our console, i think you can recognize urself what exactly it will print to the console. Troubles in finding what will ``System.out.println("Current Thread is: " +sc);`` print to the console? Dont worry i will tell you but try to learn how printing work in JAVA. 
Next we used our ``sc`` object to set a name for our Thread with the built in method ``setName()`` so now our thread is name as ``WatchOut``. Remember whenever you use the mainthread method, you need to use the try catch blocks aswell. This is because our ``sleep()`` method and other methods might throw InterruptedExceptions and we do not want our program to crash because of them.
So we made a try and catch block where we made a for loop which loops i until its value is less than or equal to 10. We made the value of i to be printed onto our console but what is ``Thread.sleep(5000);``?  its our sleep() method we discussed earlier. The ``5000`` thing is the time in milliseconds. 5000 is equivalent to 5 seconds and hence every term printed to the console will be printed with a 5 sec delay. And this is how we use our sleep method in our programs.

If you have problems in try and catch, make sure to read my try catch tutorial. If its not done, dont worry i will be making it soon. 


Thank You dont forget to mail me your problems at aerosammann : aerosammann1702@gmail.com

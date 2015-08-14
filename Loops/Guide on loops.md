#Loops Loops and Loops

**What is a loop?**
Loop is just like switch statements which we read earlier. User creates a loop inside his/her program in which the program
revolves until the condition is checked and verified to be true. 



**How does it work?**
Program enters the loop and find for the matching condition according to user input. Let us take an example of our ``for-loop.java``
file. In that file the console first asks for a number from user. It stores the number inside the ``num`` variable and then enters
our for loop, and continue looping till the condition is specified. WHen the condition is specified, the control gets out 
of loop for rest of the program execution



**4 types of loops?**
Yes you heard/read it correct, there are 4 types of Loops in JAVA unlike other languages where there are 3 types of Loops. The Loops
in JAVA are listed below - - 

1) For Loop  ``for(int i=0; i<=10; i++)`` 
         What this loops does? Control enters the loop and - the **new variable i** get initialised by the value 0. Control move
         one step forward and checks it our variable is **less that equal** to 10, surely 0<10 so its moves on to the
         next statement which is ``i++``. You must have studied ++ and -- these are called incrememnt and decrememnt operators
         and as their name, the increment or decrement the value stored in the variable.
         So when control comes to the increment statement the value of i gets incremented by 1 and control jumps back to 
         first statement again!! Now ``i=1`` cause it was incremented, jumps again to second statement ``2<10`` and then
         it jumps to third statement and increments again and now ``i = 2``. Then again it will jump to first statement until
         our value of variable ``i<=10``.
         So this is how our for loop works
         
         
2) While Loop ``while(i<10) { System.out.println(i); i++ }``
        This is also same as for loop only difference is, it first checks the condition, if its false, then go on executing the
        loop and if its true, it jumps out of the loop and thats why While loops are also called as **Pre Condition Check** Loops.
        In the above example, control will check that value of i is less that 10 and then will print its current value and
        then increment the value and will go back to start again do the same again and again till value of i=9 because its less than 10.
        As soon as value gets equal to 10 control will check the statement ``10<10`` which is false ofcourse, hence the control
        will jump out of the loop.
        
        
3) Do While Loop ``do { System.out.println(i); i++ } while(i<10)``
      Very similar to while loop, do while loop is also called **Post Condition Check** Loop. It is called so because
      it first executes what user wants and then checks the condition.
      You will learn about it in detail when you will see the piece of do-while code
      

4) Enhanched for Loop ``for(int x: [array name])``
     This comes under the advance JAVA section. 
     You will get to know what exactly it is later

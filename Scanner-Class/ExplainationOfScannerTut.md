**About the program**

The program is a simple JAVA program for the addition of two user inputted numbers. The program ask the user to enter 2 numbers and then
it displayes the result onto the console.

On line 1 we just imported the util package which is ofcourse required in our program cause we are using Scanner class.
next we created a class named ``ScannerTut`` under which we wrote our program. The main function comes after it ``public static void main(String args[])``
it tells that its a public method, it is also static, void mean it do not return a value and main is where JAVA program start running.

**NOTE**: Whenever we run a JAVA program, the compiler seach for the main function , if there is not main function it will give
an error or if there is a main function but there is nothing under it, the output screen will be blank no matter you wrote program under a different method.
You need to call that method inside the main function in order to run it. Hence main function is very important in JAVA lang

Next are our variables. ``int a,b,result`` these variables will store the userdata. Variable a will store first value , b will store second value
and result will store the addition of the two numbers.

Next is ``System.out.println`` which is used to print whatever is inside it to the console. In the case of this program it will print "Enter a number"
Next is ``a = obj.nextInt();`` this is where we store the user input value inside our variable. There are different types for storing different 
datat type like for char we use ``next();`` for Float we use ``nextFloat();`` and for Strings we use ``nextLine();``

Next is ``result = a+b`` as it shows clearly it is storing value of addition into the result variable

Finally we are printing our output on our console with ``System.out.println`` 

**WAIT, What is +result at the end??**
The + is used to concat strings. JAVA lang takes everything as String so we need to concat the strings in order to get the 
desired output at our console hence we use ``+``
So on our console the output will be like ``The Reult is : 3`` where the 3 is what we concatinated into the string.

![alt tag](http://i.imgur.com/fDGaQu6.png)

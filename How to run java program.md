#CMD Guide for running programs

Ok although running JAVA programs on CMD looks old fashioned an gives us the feeling that we are coding in 80's :p
I suggest using software for JAVA programming like ``Netbeans IDE`` or ``Eclipse``. These softwares will give you a feel like of
a professional coder and will make up your mood for coding more !!

**I have a bad and slow internet. What to do?**
Oh so thats the problem? Usually netbeans and eclipse softwares are 250+ MB and can take time when downloaded over a 
bad internet connection. But there is a way you can code in modern way without using crappy old fashioned notepad. Download the 
software ``Sublime text 2``. It is just like notepad but isn't old fashioned and its only 2Mb. Happy Coding

**How to run program on cmd once i wrote the program?**
Ok so you wrote a JAVA program on Notepad or Sublime Text or whatever, now you need to run it on cmd.

1) You need to download ``JDK ( JAVA Development Kit )`` in order to run programs. It is must needed software to run your programs if you want to use Command Prompt.

2) Once you downloaded the JDK for you system, then open the Command Prompt, make sure the program must be saved with the name format ``[name].java``. The ``.java`` extension is necessary and save your program inside ``jdk/bin``. 

3) Copy the address/directory of jdk/bin and it will be something like ``C:\Program Files\Java\jdk1.8.0_45\bin``

4) Now you need to set this directory on our cmd so for setting directory on cmd we use ``cd [directory`` and in the above case it will be like ``cd C:\Program Files\Java\jdk1.8.0_45\bin``

5) Once the directory is set, then you need to compile your program so to compile use ``javac [programname]`` like for example ``javac calculator.java`` and it will compile your code and show you error if there are some.

6) Now for running the code type in ``java [classname]`` **REMEMBER THAT JAVA IS CASE SENSITIVE SO YOUR CLASS NAME SHOULD BE SAME WHEN YOU TYPE IN THAT COMMAND** for example ``java Calculator``. Hit enter and BOOM your program will run..



HAPPY CODING ~

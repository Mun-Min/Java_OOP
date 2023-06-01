/*
 note: to run program in VS Code & Conda Env within Git Terminal...

 cd into directory where Class & Main files are located 

 compile Class & Main files utilizing javac command (javac Test.java Main.java)

 run program (java Main) 
*/
public class Main { 
    
    public static void main (String [] args) { 

        // create myHello object 
        Test myHello = new Test(); 
        
        // call function
        myHello.sayHello(); 

    }

}
/*
 note: to run program in VS Code & Conda Env within Git Terminal...
 cd into directory where Class & Main files are located 
 compile Class & Main files utilizing javac command (javac Pen.java Main.java)
 run program (java Main) 
*/

public class Main {

    public static void main (String [] args) {

        // create myPen object
        Pen myPen = new Pen(); 

        // call the pen_Color function and print result to console
        System.out.println("\nColor of the Pen: " + myPen.pen_Color());

        // call the pen_Type function and print result to console
        System.out.println("\nBall-Point type of the Pen (in mm): " + myPen.pen_Type());

        // call the Click function and print result to console
        System.out.println("\nThe pen is able to write now that it is clicked: " + myPen.Click());

        // call the un_Click function and print result to console
        System.out.println("\nThe pen is able to write now that it is clicked: " + myPen.un_Click() + "\n");

    }

}

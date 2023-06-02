/*  
object-oriented-programming practice problem 
write a program that will resemble a physical pen 
and display its attributes to the console utilizing OOP methodology 
*/

public class Pen { 

    // variable that holds the color of the pen 
    public String color = "Black"; 
    
    // variable that holds the ball-point type of the pen in mm 
    public int type = 10; 

    // variable that holds the boolean value of the clicking of the pen
    public boolean is_Clicked = false; 

    // getter functions 

    // function that returns the color of the pen 
    public String get_pen_Color() { 
        return color; 
    }

    // function that returns the ball-point type of the pen in mm 
    public int get_pen_Type() { 
        return type; 
    }

    // setter functions 
    
    // function that re-assigns original color to a new color 
    public void set_pen_Color(String new_color) { 
        color = new_color; 
    }

    // function that re-assigns original ball-point type to a new ball-point type
    public void set_pen_Type(int new_type) { 
        type = new_type; 
    }

    // function that simulates the clicking of the pen 
    public boolean Click() { 
        is_Clicked = true; 
        return is_Clicked;
    }

    // function that simulates the unclicking of the pen (you don't want the ink of your pen to dry out!)
    public boolean un_Click() { 
        is_Clicked = false; 
        return is_Clicked;
    }
}
package Literal;




public class Literal {

    //a const value which can be assigned to a variable is called literal
    // byte age = 34;    34 is literal here

    public static void main(String[] args) {
        //8 primitive datatypes
        byte age =24;
        int age1=56;
        short age2 = 45;
      //  long ageDino = 566455243255625262; error
        long ageDino = 566455243255625262L;
      //  char ch = "S"; error (bcz for char we use single quotes)
        char ch = 's';
       //  float  age3 = 5.6; error
        float age3 = 5.6f;
        double age4 = 5/6;
        boolean a = true;


        //String Literal
        String str = "It is a string";

    }
}




//by default, decimal numbers are double, to make them float we have to mention f/F
// float f1= 5.6f   or float f1= 5.6F
//for double, we "can" optionally write d/D but its's not necessary
// double d1 = 5.6d  or double d1 = 5.6D or double d1 = 5.6
//no need to mention for byte, int , short, but we need to menton when its long
//long ageDino = 566455243255625262L;
import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        // System.out.println("Taking Input from USer");

         Scanner sc = new Scanner(System.in);     //new object of Scanner Class named sc. System.in means we are taking input from user
         Scanner sc1 = new Scanner(System.in);
         // System.out.println("Enter 1st number: ");
        // int a = sc.nextInt();
        // System.out.println("Enter 2nd number");
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println("Sum of these numbers: "+ sum);


        // System.out.println("Enter a number to check if it is integer or not");
        // boolean b1 = sc.hasNextInt();  //use to check the validity
        // System.out.println(b1);

        System.out.println("Enter a string");
        String str1 = sc.next();       //it will only read first word
        System.out.println(str1);
        System.out.println("Again Enter a string");
        String str2 = sc1.nextLine();      //it will read entire sentence including spaces
        System.out.println(str2);

    }
}

//in order to read data from user, java has a scanner class 
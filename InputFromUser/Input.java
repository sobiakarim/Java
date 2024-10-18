import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        System.out.println("Taking Input from USer");
        Scanner sc = new Scanner(System.in);     //new object of Scanner Class named sc. System.in means we are taking input from user
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of these numbers: "+ sum);
    }
}

//in order to read data from user, java has a scanner class 
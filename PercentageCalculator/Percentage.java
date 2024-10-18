package PercentageCalculator;

import java.util.Scanner;

public class Percentage{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float s1, s2,s3,s4,s5;
        System.out.println("Enter 1st subject's marks: ");
        s1 = scan.nextFloat();
        System.out.println("Enter 2nd subject's marks: ");
        s2 = scan.nextFloat();
        System.out.println("Enter 3rd subject's marks: ");
        s3 = scan.nextFloat();
        System.out.println("Enter 4th subject's marks: ");
        s4 = scan.nextFloat();
        System.out.println("Enter 5th subject's marks: ");
        s5 = scan.nextFloat();

        float cal = ((s1+s2+s3+s4+s5)/500)*100;

        System.out.println("Percentage  = "+cal + "%");


    }
}
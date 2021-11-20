package Searching;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if(n<1){
            return 1;
        }
        else{
            return (n * factorial(n-1));
        }


    }




    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a number for factorial :");
            int number = scan.nextInt();
            int fact = factorial(number);
            System.out.println("factorial " + number +" is " + fact );
    }
}


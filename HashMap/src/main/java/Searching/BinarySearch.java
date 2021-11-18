package Searching;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
            int[] array = new int[100];
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your element: " );
            int Target = scan.nextInt();
        for (int i = 0; i < array.length;i++){
            array[i] = i;
        }
        int index = binarySearch(array,Target);
        if (index == -1) System.out.println(Target + " not found...");
        else{
            System.out.println("your element found at :" + index);
        }


    }
    public static int binarySearch(int[] array,int Target){



        return -1;
    }



}

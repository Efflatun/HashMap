package Searching;


import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {


        int [] array ={9 , 5, 1, 2, 17, 18, 3, 7, 10}     ;
        int index = linearSearch(array);

        if(index != -1){
            System.out.println("element found at index :" + index);
        }
        else{
            System.out.println("element  not found");
        }




    }


    public static int linearSearch(int[] array){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your element :");
        int value = scan.nextInt();
        for(int i = 0; i < array.length; i++){
            if(array[i] == value) return i;
        }
        return -1;
    }
}

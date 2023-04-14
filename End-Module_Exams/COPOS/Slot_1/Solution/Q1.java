// Q1. Write a program to Accept an Array form user and find pairs of values form array that return a Sum ‘k’ defined by user.

import java.util.Scanner;

public class COPOSSolutionQ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Asking the user for the size of the array
        System.out.println("Enter the size of your Array: ");
        int size = in.nextInt();

        // Declaration of Array
        int [] arr = new int[size];

        // Asking user for the elements of the array
        System.out.println("Enter the elements of your Array: ");

        for (int i=0; i<size; i++){
            System.out.println("Element " + (i+1) + ": ");
            arr[i] = in.nextInt();
        }

        // Asking user for Sum
        System.out.print("Enter the Sum for which you wish to check for pairs in the Array: ");
        int sum = in.nextInt();


        // Checking for pairs in the array whose sum is equal to user defined sum
        for (int i=0; i<size; i++){
            for (int j=0; j<i; j++){
                // Printing out the pairs of elements from the Array
                if (arr[i]+arr[j] == sum)
                    System.out.println("(" + arr[i] + "," + arr[j] + ") ");
            }
        }
    }
}

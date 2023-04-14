// Accept 10 integers from user and count the occurrences of each element in the array.

import java.util.Scanner;

public class COPOSSolutionQ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter the 10 elements of your array: ");
      
      // Asking user for inputs using for loop
      for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }
      
      // Checking the occurance of each element in the array
                for (int i = 0; i < arr.length; i++) {
                    int count = 0;
                  
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[i] == arr[k])
                            count++;
                    }
                  
                  // Printing out the occurance of each element in the array
                    System.out.println(arr[i] + " occurs " + count + " times in the Array");
                }
    }
}

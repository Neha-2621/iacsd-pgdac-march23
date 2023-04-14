/*
Q2. Write a Menu Driven Program to:
        1. Add a sub-string at a user-defined index in a String.
        2. Delete a sub-string from a user defined index in a String.
        3. Replace a sub-string from a user defined index in a String.
*/

import java.util.Scanner;
public class COPOSSolutionQ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose an Operation: ");
        System.out.println("1. Add a sub-string at a user-defined index in a String.");
        System.out.println("2. Delete a sub-string from a user defined index in a String.");
        System.out.println("3. Replace a sub-string from a user defined index in a String.");

        String s1;
        String s2;
        int index;
        String s3;
        int choice;
        int k;

        do{
            // Asking user to provide input for switch case variable
            System.out.println("\nEnter your selection: ");
            choice = in.nextInt();

            switch (choice){
                case 1:
                    System.out.println("\nAdd a sub-string at a user-defined index in a String");

                    // Inserting a nextLine() function to compensate for line skipping
                    in.nextLine();
                    // Asking user for input
                    System.out.println("Enter your String: ");
                    s1 = in.nextLine();

                    // Asking user for sub-string
                    System.out.println("Enter the sub-string you want to add into the String: ");
                    s2 = in.nextLine();

                    // Asking user for the index at which he wants to add the sub-string
                    System.out.println("Enter the Index at which you wish to insert he sub-string: ");
                    index = in.nextInt();

                    // Printing the output
                    System.out.println("\nYour new String is: ");
                    System.out.println(s1.substring(0,index) +  s2 + s1.substring(index));
                    break;

                case 2:
                    System.out.println("\nDeleting a sub-string at a user-defined index in a String");

                    // Inserting a nextLine() function to compensate for line skipping
                    in.nextLine();
                    // Asking user for input
                    System.out.println("Enter your String: ");
                    s1 = in.nextLine();

                    // Asking user for sub-string
                    System.out.println("Enter the sub-string you want to delete from the String: ");
                    s2 = in.nextLine();

                    // Asking user for the index at which he wants to delete the sub-string
                    System.out.println("Enter the Index at which you wish to insert he sub-string: ");
                    index = in.nextInt();

                    // Printing the output
                    System.out.println("\nYour new String is: ");
                    System.out.println(s1.substring(0,index) + s1.substring((index+s2.length())));
                    break;

                case 3:
                    System.out.println("\nReplace a sub-string in the String");

                    // Inserting a nextLine() function to compensate for line skipping
                    in.nextLine();
                    // Asking user for input
                    System.out.println("Enter your String: ");
                    s1 = in.nextLine();

                    // Asking user for sub-string
                    System.out.println("Enter the sub-string you want to replace in the String: ");
                    s2 = in.nextLine();

                    // Asking user for the index at which he wants to add the sub-string
                    System.out.println("Enter the Index at which you wish to insert he sub-string: ");
                    s3 = in.nextLine();

                    // Finding the index of the sub-string to be replaced
                    k = s1.indexOf(s2);

                    // Printing the output
                    System.out.println("\nYour new String is: ");
                    System.out.println(s1.substring(0,k) + s3 + s1.substring(k+s2.length()));
                    break;

                case 4:
                    System.out.println("---------- Exiting Program ----------");
                    break;

                default:
                    System.out.println("Invalid Input");
                    System.out.println("1. Add a sub-string at a user-defined index in a String.");
                    System.out.println("2. Delete a sub-string from a user defined index in a String.");
                    System.out.println("3. Replace a sub-string from a user defined index in a String.");
                    break;
            }
        }while (choice!=4);
    }
}

// Solution video link: https://www.youtube.com/watch?v=YftZOieDVcE

package Understanding_Patterns;

import java.util.Scanner;
public class square_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Square Pattern");
        System.out.println("Enter the number of rows for the square pattern:"); // Taking input from user
        // This will determine the size of the square pattern
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) { // Loop for each row
            for(int j = 0; j < n; j++) { // Loop for each column in the row
                System.out.print(" *"); // Printing a star followed by a space
            }
            System.out.println(); // Move to the next line after printing all columns in the current row
        }
        sc.close();
    }
}

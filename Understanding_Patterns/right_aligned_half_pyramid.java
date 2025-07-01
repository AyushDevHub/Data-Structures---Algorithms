package Understanding_Patterns;
import java.util.Scanner;

public class right_aligned_half_pyramid {
    public static void main(String args[]) {
        System.out.println(" Right Aligned Half Pyramid");
        System.out.print("Enter the number of rows for the right aligned half pyramid: "); //
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Taking input from user
        for(int i = 1; i <= n; i++) { // Loop for each row
            for(int j = 1; j <= n-i; j++) { // Loop for each column in the row
                System.out.print("  "); // Printing spaces for right alignment
            }
            for(int j = 1; j <= i; j++) { // Loop for each column in the row
                System.out.print("* "); // Printing a star followed by a space
            }
            System.out.println(); // Move to the next line after printing all columns in the current row
        }
        sc.close();
    }
    
}


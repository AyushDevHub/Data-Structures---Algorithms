package Understanding_Patterns;
import java.util.Scanner;
public class LeftAlignedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Left Aligned Half Pyramid");
        System.out.print("Enter the number of rows for the left aligned half pyramid: "); // Taking input from user
        int n = sc.nextInt();
                for(int i = 1; i <= n; i++) { // Loop for each row
            for(int j = 1; j <= i; j++) { // Loop for each column in the row
                System.out.print(" *"); // Printing a star followed by a space
            }
            System.out.println(); // Move to the next line after printing all columns in the current row
        }
        sc.close();
    }
    
}

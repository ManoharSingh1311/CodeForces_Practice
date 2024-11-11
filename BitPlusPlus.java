import java.util.Scanner;

public class BitPlusPlus {

    public static void main(String[] args) {
        // Explanation:
        // The problem is based on a simple simulation of increment and decrement operations.
        // We are given a number 'n' which represents the number of statements.
        // Each statement can either increase or decrease a variable 'x' (initially set to 0) based on the operation.
        // The operation can be in two forms: "++X", "X++" (both mean increment by 1) and "--X", "X--" (both mean decrement by 1).
        // Our goal is to process these 'n' statements and calculate the final value of 'x'.
        
        Scanner sc = new Scanner(System.in);
        
        // Read the number of statements
        int n = sc.nextInt();
        int x = 0; // Initialize x to 0
        
        // Loop through each statement
        for (int i = 0; i < n; i++) {
            String statement = sc.next(); // Read each statement
            
            // Check the middle character to determine if it's an increment (++) or decrement (--)
            if (statement.charAt(1) == '+') {
                x++; // Increment x by 1
            } else {
                x--; // Decrement x by 1
            }
        }
        
        // Print the final value of x after processing all statements
        System.out.println(x);
        
        sc.close();
    }
}

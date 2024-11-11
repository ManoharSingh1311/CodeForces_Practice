import java.util.Scanner;

public class HexadecimalsTheorem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // If the number is 0, return 0 0 0
        if (n == 0) {
            System.out.println("0 0 0");
            return;
        }
        // If the number is 1, return 0 0 1
        else if (n == 1) {
            System.out.println("0 0 1");
            return;
        }

        // Variables to store Fibonacci numbers
        int f = 0, s = 1, t;
        int e = 0;

        // Loop to find the Fibonacci number greater than or equal to n
        while (true) {
            t = f + s; // Generate next Fibonacci number

            if (t < n) {
                e = f;  // Update e to the value of f
                f = s;  // Move f to the value of s
                s = t;  // Move s to the new Fibonacci number
            }

            if (t >= n) {
                break;  // Exit the loop if the Fibonacci number is greater than or equal to n
            }
        }

        // Check if the found Fibonacci number is equal to n
        if (t == n) {
            System.out.println(e + " " + f + " " + f);
        } else {
            System.out.println("I'm too stupid to solve this problem");
        }
    }
}

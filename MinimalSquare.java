// This program calculates the minimum area of a square that can contain two identical rectangles
// with given dimensions 'a' and 'b'. The rectangles can be rotated and placed side-by-side 
// or stacked to fit within the square.

// 'solve' function:
// - For each test case, it determines the minimal side length of a square that can fit both rectangles.
// - It calculates two possible square side lengths based on the two orientations of the rectangles:
//     1. Side-by-side placement (doubling one side length).
//     2. Stacked placement (doubling the other side length).
// - It selects the smallest side length required and calculates the square area as side * side.

// 'main' function:
// - Reads the number of test cases.
// - For each test case, reads the dimensions 'a' and 'b' and calls 'solve' to output the result.
import java.util.Scanner;

public class MinimalSquare {

    private static void solve(int a, int b) {
        int side = Math.min(Math.max(a * 2, b), Math.max(a, b * 2));
        System.out.println(side * side);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            solve(a, b);
        }
        
        scanner.close();
    }
}

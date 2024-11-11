/*
A. HQ9+

HQ9+ is a joke programming language with only four one-character instructions:
- "H" prints "Hello, World!",
- "Q" prints the source code of the program itself,
- "9" prints the lyrics of the "99 Bottles of Beer" song,
- "+" increments the value stored in the internal accumulator (but does not produce any output).

We are given a program written in HQ9+ and need to determine if executing this program will produce any output.

Input:
- A single line p which contains between 1 and 100 characters. Each character's ASCII code will be between 33 (exclamation mark) and 126 (tilde).

Output:
- Print "YES" if executing the program produces any output, otherwise print "NO".

Examples:

Input:
Hi!
Output:
YES

Input:
Codeforces
Output:
NO
*/

import java.util.Scanner;

public class HQ9Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: A string representing the HQ9+ program
        String program = sc.nextLine();

        // Flag to check if any of the characters will produce output
        boolean willProduceOutput = false;

        // Check each character in the program string
        for (char c : program.toCharArray()) {
            // If 'H', 'Q', or '9' is found, set the flag to true
            if (c == 'H' || c == 'Q' || c == '9') {
                willProduceOutput = true;
                break; // No need to check further, we know it will produce output
            }
        }

        // Output result
        if (willProduceOutput) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // Close the scanner
        sc.close();
    }
}

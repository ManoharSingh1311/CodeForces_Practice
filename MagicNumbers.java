/*
Problem: Magic Numbers

A magic number is formed by concatenating the numbers 1, 14, and 144 in any order any number of times. 
You need to determine if a given number n is a magic number.

Input:
- A single integer n (1 ≤ n ≤ 10^9), which contains no leading zeros.

Output:
- Print "YES" if n is a magic number, otherwise print "NO".

Steps:
1. Read the input number as a string.
2. Use regular expression matching to check if the number can be composed only of the sequences "1", "14", and "144".
3. Print "YES" if it matches, otherwise print "NO".

Example:

Input:
114114

Output:
YES
*/

import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        scanner.close();

        // Check if the number is a magic number
        if (n.matches("(1|14|144)*")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

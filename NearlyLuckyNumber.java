/* 
Problem: Nearly Lucky Number

A lucky number is a number that contains only the digits '4' or '7'. 
Petya considers a number "nearly lucky" if the count of lucky digits in the number is itself a lucky number.

Input:
- A single integer 'n' (1 ≤ n ≤ 10^18).

Output:
- Print "YES" if the number is nearly lucky, otherwise print "NO".

Steps:
1. Read the input number 'n' as a long integer.
2. Initialize a counter to keep track of the number of lucky digits ('4' or '7') in 'n'.
3. Iterate through each digit of the number:
   - Check if the digit is '4' or '7'.
   - If it is, increment the counter.
4. After counting, check if the count itself is a lucky number (i.e., it is either 4 or 7).
5. If the count is 4 or 7, print "YES", otherwise print "NO".

Examples:

Input 1:
40047
Output 1:
NO
Explanation:
There are 3 lucky digits (first one and last two). Since 3 is not a lucky number, the output is "NO".

Input 2:
7747774
Output 2:
YES
Explanation:
There are 7 lucky digits, and 7 is a lucky number, so the output is "YES".

Input 3:
1000000000000000000
Output 3:
NO
Explanation:
There are no lucky digits, so the count is 0, which is not a lucky number.
*/
import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // Read the input number
        
        int luckyCount = 0; // Variable to count lucky digits
        
        while (n > 0) {
            long digit = n % 10; // Get the last digit of the number
            if (digit == 4 || digit == 7) {
                luckyCount++; // Increment count if digit is lucky (4 or 7)
            }
            n = n / 10; // Remove the last digit from the number
        }
        
        // Check if the count of lucky digits is itself a lucky number (4 or 7)
        if (luckyCount == 4 || luckyCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}

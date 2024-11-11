 /*
         Problem Explanation:
         Petya considers certain numbers "lucky." A number is lucky if it consists only of the digits 4 and 7.
         Examples of lucky numbers are 4, 7, 44, 47, 77, 444, etc.

         Petya also calls a number "almost lucky" if it can be evenly divided by at least one lucky number.
         Given a number n, the task is to check whether it is almost lucky.

         Input:
         - A single integer n (1 ≤ n ≤ 1000) that we need to check.
         
         Output:
         - Print "YES" if the number n is almost lucky (i.e., divisible by any lucky number).
         - Otherwise, print "NO".

         Example:
         - If n = 47, output is "YES" because 47 is a lucky number.
         - If n = 16, output is "YES" because 16 is divisible by 4 (a lucky number).
         - If n = 78, output is "NO" because it is not divisible by any lucky number.
        */

import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the integer n that needs to be checked.
        long n = scanner.nextLong();
        
        // Check if n is divisible by any "lucky" number and print "YES" if it is,
        // otherwise print "NO".
        if (n % 4 == 0 || n % 7 == 0 || n % 44 == 0 || n % 47 == 0 || n % 74 == 0 ||
            n % 77 == 0 || n % 444 == 0 || n % 447 == 0 || n % 474 == 0 || n % 744 == 0 ||
            n % 477 == 0 || n % 747 == 0 || n % 774 == 0 || n % 777 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}

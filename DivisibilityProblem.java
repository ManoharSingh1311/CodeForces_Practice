/*
This program solves the "Divisibility Problem" for multiple test cases. 
Given two positive integers `a` and `b` for each test case, the task is to find the minimum number 
of moves required to make `a` divisible by `b`. In each move, we can increase `a` by 1.

Steps:
1. Read the number of test cases `t`.
2. For each test case:
   - If `a` is already divisible by `b`, no moves are needed, so output 0.
   - If `a` is not divisible by `b`, calculate the remainder `rem = a % b`.
   - The minimum number of moves required to make `a` divisible by `b` is `b - rem`.
3. Print the result for each test case.

Example:
If `a = 10` and `b = 4`, `a % b = 2`, so the output will be `4 - 2 = 2`.
If `a = 92` and `b = 46`, `a % b = 0`, so the output will be `0`.
*/

import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        // Process each test case
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            // Check if a is already divisible by b
            if (a % b == 0) {
                System.out.println(0);
            } else {
                long rem = a % b;
                System.out.println(b - rem);
            }
        }
        
        sc.close();
    }
}

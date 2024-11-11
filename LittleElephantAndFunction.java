/*
A. Little Elephant and Function

The problem involves finding a permutation of numbers from 1 to n, such that after performing the Little Elephant's recursive function f(n), 
the permutation will be sorted in ascending order.

Function f(x) recursively sorts the first x elements by calling f(x-1) and swapping the (x-1)-th and x-th elements. 
The task is to find a permutation where, after applying this function f(n), the sequence becomes sorted in ascending order.

Input:
- A single integer n (1 ≤ n ≤ 1000) — the size of the permutation.

Output:
- Print a permutation of n distinct integers, such that after calling f(n), the permutation will be sorted.

Examples:

Input:
1
Output:
1

Input:
2
Output:
2 1
*/

import java.util.Scanner;

public class LittleElephantAndFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the permutation
        int n = sc.nextInt();

        // Special case: If n is 1, simply print 1
        if (n == 1) {
            System.out.println(1);
            return;
        }

        // Print the largest number n first
        System.out.print(n + " ");

        // Print numbers 1 to n-1 in ascending order
        for (int i = 1; i < n; i++) {
            System.out.print(i + " ");
        }
        
        sc.close(); // Close the scanner
    }
}

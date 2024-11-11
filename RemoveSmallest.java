/*
 * Problem: Determine if you can reduce an array to one element 
 * by repeatedly removing pairs of elements with a difference ≤ 1.
 * 
 * Input:
 * - `t`: Number of test cases.
 * - For each test case:
 *    - `n`: Size of array `a`.
 *    - `a`: Array of `n` integers.
 * 
 * Output:
 * - "YES" if array can be reduced to one element; otherwise, "NO".
 * 
 * Approach: Sort the array, then check if any consecutive elements 
 * differ by more than 1.
 */

import java.util.*;
import java.io.*;

public class RemoveSmallest {

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long[] arr = new long[(int) n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        if (n == 1) {
            System.out.println("YES");
            return;
        }

        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] > 1) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();

        while (T-- > 0) {
            solve(sc);
        }

        sc.close();
    }
}

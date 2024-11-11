/*
Problem: Shooshuns and Sequence

Shooshuns have a sequence of `n` integers on a blackboard. They can perform one operation which consists of two steps:
1. Find the number that is at the `k`-th position in the sequence and add it to the end of the sequence.
2. Delete the first number from the sequence.

The goal is to find the minimum number of operations required to make all the numbers in the sequence the same. If it's impossible, return `-1`.

Input:
- The first line contains two integers `n` and `k` (1 ≤ k ≤ n ≤ 100000), where `n` is the size of the sequence and `k` is the 1-based index used in the operation.
- The second line contains `n` space-separated integers representing the sequence.

Output:
- Print the minimum number of operations required to make all the numbers in the sequence the same, or `-1` if it's impossible.

Example:
Input:
3 2
3 1 1
Output:
1

Explanation:
- Initially, the sequence is [3, 1, 1].
- After one operation, we add the 2nd number (1) to the end, and the sequence becomes [1, 1, 1], so the answer is 1.

Input:
3 1
3 1 1
Output:
-1

Explanation:
- No matter how many operations we perform, the sequence will always contain distinct numbers 3 and 1, so the answer is -1.
*/

import java.util.*;
import java.util.Scanner;

public class ShooshunsandSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int last = 0, continuous = 1;
        
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            
            if (a == last) {
                continuous += 1;
            } else {
                continuous = 1;
            }
            last = a;
        }
        
        if (continuous + k > n) {
            System.out.println(n - continuous);
        } else {
            System.out.println(-1);
        }
    }
}

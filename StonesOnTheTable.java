/*
Problem: Stones on the Table

You are given a row of stones where each stone can be Red ('R'), Green ('G'), or Blue ('B'). The task is to remove the minimum number of stones such that no two adjacent stones have the same color.

Input:
- The first line contains an integer 'n' (1 ≤ n ≤ 50), which represents the number of stones.
- The second line contains a string 's' of length 'n', where each character represents the color of the stones.

Output:
- Print a single integer, representing the minimum number of stones to remove to ensure no two neighboring stones have the same color.

Steps:
1. Read the input values: the number of stones 'n' and the string 's' representing their colors.
2. Initialize a variable to store the count of stones to be removed.
3. Iterate through the string and check each pair of consecutive stones.
   - If two consecutive stones have the same color, increment the count (since one of them needs to be removed).
4. After the loop, print the count of stones that need to be removed.

Examples:

Input 1:
3
RRG
Output 1:
1
Explanation:
The first two stones are both 'R', so one of them needs to be removed.

Input 2:
5
RRRRR
Output 2:
4
Explanation:
All stones are the same color, so 4 stones must be removed to make sure no two neighboring stones have the same color.

Input 3:
4
BRBG
Output 3:
0
Explanation:
All neighboring stones have different colors, so no removal is needed.
*/

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the number of stones
        String s = sc.next(); // Read the string representing the colors of the stones
        
        int count = 0; // Variable to store the number of stones to be removed
        
        // Iterate through the string to compare adjacent stones
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++; // If two neighboring stones have the same color, increment the count
            }
        }
        
        System.out.println(count); // Output the result
        
        sc.close();
    }
}

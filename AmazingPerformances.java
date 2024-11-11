/*
Problem: Amazing Performances

Vasya tracks the progress of his favorite coder in contests. The coder’s performance is considered amazing if during any contest they break their best or worst performance records from previous contests.

Input:
- n: Number of contests (1 ≤ n ≤ 1000).
- An array of integers representing the points earned in the contests.

Output:
- Print the number of amazing performances.

Steps:
1. Read the input for the number of contests (n) and the points earned in each contest.
2. Initialize the first contest's score as both the current max and min scores.
3. Traverse the array from the second contest onward:
   - If the current score breaks the max record, update max and increment the count.
   - If the current score breaks the min record, update min and increment the count.
4. Print the total number of amazing performances.

Example:

Input:
5
100 50 200 150 200

Output:
2
Explanation:
The performances during the 2nd and 3rd contests are amazing.
*/

import java.util.Scanner;

public class AmazingPerformances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Read number of contests
        int[] arr = new int[n]; // Array to store points earned in contests

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read contest points
        }

        int ans = 0; // Variable to count amazing performances
        int max = arr[0]; // Initial max points (first contest)
        int min = arr[0]; // Initial min points (first contest)

        // Check each contest after the first
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) { // Breaks max record
                max = arr[i];
                ans++;
            }

            if (arr[i] < min) { // Breaks min record
                min = arr[i];
                ans++;
            }
        }

        System.out.println(ans); // Output the count of amazing performances
        sc.close();
    }
}

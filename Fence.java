/*
Problem Statement:
There is a fence in front of Polycarpus's home consisting of n planks, each with a distinct height. 
Polycarpus needs to remove exactly k consecutive planks to create space for moving a piano into his house. 
Since higher planks are more difficult to remove, he wants to find k consecutive planks that have the 
minimum possible total height.

You are required to find and print the 1-based index of the first plank in the sequence of k consecutive 
planks that have the smallest sum of heights. If there are multiple such sequences, you can print any of them.

Input:
- The first line contains two integers, n and k (1 ≤ n ≤ 150,000, 1 ≤ k ≤ n) — the number of planks and the number of consecutive planks to select.
- The second line contains n integers h1, h2, ..., hn (1 ≤ hi ≤ 100) — the heights of the planks.

Output:
- Print one integer — the 1-based index of the first plank in the sequence of k consecutive planks with the minimal sum of heights.

Examples:
Input:
7 3
1 2 6 1 1 7 1
Output:
3

Explanation:
In this example, we are asked to find 3 consecutive planks with the minimum sum of heights.
The planks with indexes 3, 4, and 5 have the sum of heights 8, which is the smallest possible sum.
Therefore, the result is 3.
*/

import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading the input values
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        
        // Reading the heights of the planks
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        
        // Variables to store the current window sum and the minimum sum found
        int sum = 0;
        int idx = 1; // To store the starting index of the minimal sum window (1-based index)
        
        // If the number of planks is exactly equal to the width of the piano, the answer is 1
        if (n == k) {
            System.out.println(1);
            return;
        }
        
        int minsum = 0;
        
        // Initialize the first window sum and minsum with the first k planks
        for (int i = 0; i < k; i++) {
            sum += h[i];
            minsum = sum;
        }
        
        // Sliding window logic to find the minimum sum of k consecutive planks
        for (int i = k; i < n; i++) {
            sum = sum - h[i - k] + h[i];  // Slide the window by removing the leftmost and adding the new element
            if (sum < minsum) {
                minsum = sum;
                idx = i + 2 - k; // Update the index (1-based)
            }
        }
        
        // Output the index of the first plank in the sequence with the minimal sum
        System.out.println(idx);
        
        sc.close();
    }
}

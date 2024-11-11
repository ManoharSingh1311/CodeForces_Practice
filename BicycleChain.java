/*
Problem: Bicycle Chain

Vasya's bicycle chain drive consists of two parts: stars on the pedal axle and stars on the rear wheel axle. Each pair of stars has a gear ratio calculated as the number of teeth on the rear wheel star divided by the number of teeth on the pedal axle star. Vasya only considers integer gear ratios and wants to find the maximum gear ratio that is an integer, as well as how many such ratios exist.

Input:
- n: Number of stars on the pedal axle (1 ≤ n ≤ 50).
- An array of integers representing the number of teeth on the stars of the pedal axle.
- m: Number of stars on the rear wheel axle (1 ≤ m ≤ 50).
- An array of integers representing the number of teeth on the stars of the rear wheel axle.

Output:
- Print the number of gears that produce the maximum integer gear ratio.

Steps:
1. Read the input for the number of stars on the pedal axle (n) and the number of teeth for each star.
2. Read the input for the number of stars on the rear wheel axle (m) and the number of teeth for each star.
3. Initialize a counter for the number of maximum gear ratios and a variable to track the current maximum ratio.
4. Iterate over all possible pairs of pedal and rear wheel stars:
   - If the gear ratio (rear teeth / pedal teeth) is an integer, check if it’s a new maximum.
   - If the gear ratio is equal to the current maximum, increment the counter.
   - If it exceeds the current maximum, update the maximum and reset the counter.
5. Print the total number of gears with the maximum ratio.

Example:

Input:
2
4 5
3
12 13 15

Output:
2
Explanation:
There are two gears with the maximum ratio of 3: (4, 12) and (5, 15).
*/

import java.util.Scanner;

public class BicycleChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input for the number of stars on the pedal axle
        int n = sc.nextInt();
        int[] pedalStars = new int[n];
        for (int i = 0; i < n; i++) {
            pedalStars[i] = sc.nextInt();
        }

        // Read input for the number of stars on the rear wheel axle
        int m = sc.nextInt();
        int[] rearStars = new int[m];
        for (int i = 0; i < m; i++) {
            rearStars[i] = sc.nextInt();
        }

        int maxRatio = Integer.MIN_VALUE; // To store the maximum ratio found
        int count = 0; // To count the gears with the maximum ratio

        // Iterate through each pair of stars on the pedal and rear axles
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Check if the gear ratio is an integer
                if (rearStars[i] % pedalStars[j] == 0) {
                    int ratio = rearStars[i] / pedalStars[j];
                    // If it's the maximum ratio so far
                    if (ratio > maxRatio) {
                        maxRatio = ratio;
                        count = 1; // Reset count as we found a new max
                    } else if (ratio == maxRatio) {
                        count++; // Increment count for the same max ratio
                    }
                }
            }
        }

        // Output the number of gears with the maximum ratio
        System.out.println(count);

        sc.close();
    }
}

import java.util.Scanner;

public class FlippingGame {
    
    // This program solves the Flipping Game problem. 
    // The goal is to maximize the number of 1's in an array of 0's and 1's by flipping a subarray (changing 0's to 1's and 1's to 0's) exactly once.
    //
    // Steps:
    // 1. We first check the total number of 1's in the original array. If the array is all 1's, the best we can do after one flip is to change one 1 to 0, so we return n-1.
    // 2. We then consider flipping every possible subarray and calculate how many 1's there will be after the flip.
    //    - For each subarray, we compute how many 0's will be flipped to 1 and how many 1's will be flipped to 0.
    // 3. The goal is to find the subarray that maximizes the number of 1's after one flip and print that maximum number.
    //
    // The time complexity is O(n^3), which is acceptable for n up to 100.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        int n = sc.nextInt();  // Input size of the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Input array elements (either 0 or 1)
        }

        // Step 2: Special case: if all elements are 1
        // If there is no 0, flipping won't increase the number of 1s.
        int totalOnes = 0;  // Count total number of ones in the original array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) totalOnes++;
        }

        // Edge case: If all are 1s, you can't increase the number of 1s
        if (totalOnes == n) {
            System.out.println(n - 1);  // Flip at least one to 0 to maximize
            return;
        }

        // Step 3: Apply flipping logic
        int maxGain = Integer.MIN_VALUE;  // To track maximum gain of ones after a flip

        // Use nested loops to check for each possible subarray
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int onesAfterFlip = 0;

                // Loop through the array and calculate the number of 1s after flipping [i...j]
                for (int k = 0; k < n; k++) {
                    if (k >= i && k <= j) {
                        // Flip the elements in the subarray
                        onesAfterFlip += (1 - arr[k]);  // Flip 0 to 1 and 1 to 0
                    } else {
                        // Keep the rest of the array as it is
                        onesAfterFlip += arr[k];
                    }
                }

                // Update maxGain if we have a better solution
                maxGain = Math.max(maxGain, onesAfterFlip);
            }
        }

        // Step 4: Print the maximum number of 1s we can obtain after one flip
        System.out.println(maxGain);
    }
}

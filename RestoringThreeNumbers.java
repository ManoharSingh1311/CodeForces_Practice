/*
 * Problem: Given four numbers representing the pairwise sums of three unknown integers 
 * a, b, and c, and the sum of all three (a + b + c), determine the values of a, b, and c.
 * The four numbers are given in random order, and it is guaranteed that a solution exists.
 */

import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] arr = new long[4];
        
        // Read input values
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextLong();
        }
        scanner.close();
        
        // Sort the array
        Arrays.sort(arr);
        
        // Calculate the three numbers based on the sorted array
        long a = arr[3] - arr[0];
        long b = arr[3] - arr[1];
        long c = arr[3] - arr[2];
        
        // Output the results
        System.out.println(a + " " + b + " " + c);
    }
}

import java.util.Scanner;

/**
 * Problem: Most Unstable Array
 * 
 * You are given two integers n and m. You need to construct an array a of length n 
 * consisting of non-negative integers such that the sum of elements in the array is exactly m.
 * The goal is to maximize the sum of absolute differences between adjacent elements:
 * 
 *   ∑|a[i] - a[i+1]| for i from 1 to n-1.
 * 
 * To achieve this, you can use the following strategy:
 * - If n == 1, the answer is 0 because there's only one element.
 * - If n >= 2, the maximum value is given by min(2, n - 1) * m, which effectively considers 
 *   the maximum difference you can create with the available sum m.
 */

public class MostUnstableArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); // number of test cases
        
        while (T-- > 0) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();
            
            // Calculate the maximum possible value of the sum of absolute differences
            long result = Math.min(2, n - 1) * m;
            
            System.out.println(result);
        }
        
        scanner.close();
    }
}

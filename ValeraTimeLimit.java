import java.util.Arrays;
import java.util.Scanner;

/**
 * Valera's Time Limit Problem
 *
 * Problem description:
 * Valera needs to set a time limit (TL) for a problem, such that:
 * 1. All correct solutions pass the system testing (i.e., their running time must be ≤ TL).
 * 2. At least one correct solution passes with "extra" time, meaning its running time satisfies the condition 2a ≤ TL.
 * 3. All wrong solutions should fail the system testing (i.e., their running time must be > TL).
 * 4. The TL should be the minimum possible value that satisfies the above conditions.
 *
 * Input: 
 * The first line contains two integers n (number of correct solutions) and m (number of wrong solutions).
 * The second line contains n integers representing the running times of the correct solutions.
 * The third line contains m integers representing the running times of the wrong solutions.
 *
 * Output: 
 * The minimum valid TL that satisfies all conditions, or -1 if no valid TL exists.
 *
 * Example:
 * Input:
 * 3 6
 * 4 5 2
 * 8 9 6 10 7 11
 * Output:
 * 5
 *
 * Input:
 * 3 1
 * 3 4 5
 * 6
 * Output:
 * -1
 */
public class ValeraTimeLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading the number of correct and wrong solutions
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // Reading correct solutions running times
        int[] correctSolutions = new int[n];
        for (int i = 0; i < n; i++) {
            correctSolutions[i] = sc.nextInt();
        }
        
        // Reading wrong solutions running times
        int[] wrongSolutions = new int[m];
        for (int i = 0; i < m; i++) {
            wrongSolutions[i] = sc.nextInt();
        }
        
        // Sorting both arrays
        Arrays.sort(correctSolutions);
        Arrays.sort(wrongSolutions);
        
        // v is the minimum correct solution time, p is the maximum correct solution time, c is the minimum wrong solution time
        int v = correctSolutions[0];
        int p = correctSolutions[n - 1];
        int c = wrongSolutions[0];
        
        // The proposed time limit (TL) should be max(2 * v, p)
        int proposedTL = Math.max(2 * v, p);
        
        // If the proposed TL is less than the smallest wrong solution time, it is valid
        if (proposedTL < c) {
            System.out.println(proposedTL);
        } else {
            // Otherwise, no valid TL exists
            System.out.println(-1);
        }
        
        sc.close();
    }
}

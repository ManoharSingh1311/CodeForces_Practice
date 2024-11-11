/*
     * Problem:
     * Given two integers, n and k, find the k-th positive integer that is
     * NOT divisible by n.
     * 
     * Example:
     * If n = 3 and k = 7, the sequence of numbers not divisible by 3 is:
     * 1, 2, 4, 5, 7, 8, 10, 11, ...
     * The 7-th number in this sequence is 10.
*/
import java.util.Scanner;

public class KthNotDivisibleByN {

    private static void solve(long n, long k) {
        long result = k + (k - 1) / (n - 1);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            solve(n, k);
        }
        
        scanner.close();
    }
}

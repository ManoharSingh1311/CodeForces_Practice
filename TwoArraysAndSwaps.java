import java.util.*;

public class TwoArraysAndSwaps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // Number of test cases
        while (T-- > 0) {
            int n = sc.nextInt();  // Number of elements in arrays a and b
            int k = sc.nextInt();  // Maximum number of swaps allowed
            
            int[] a = new int[n];
            int[] b = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            
            System.out.println(maximizeSumAfterSwaps(a, b, n, k));
        }
        
        sc.close();
    }

    private static int maximizeSumAfterSwaps(int[] a, int[] b, int n, int k) {
        Arrays.sort(a);  // Sort array a in ascending order
        Arrays.sort(b);  // Sort array b in ascending order
        
        // Reverse array b to get descending order
        for (int i = 0; i < n / 2; i++) {
            int temp = b[i];
            b[i] = b[n - i - 1];
            b[n - i - 1] = temp;
        }
        
        // Perform swaps for first k elements or until beneficial
        for (int i = 0; i < k && i < n; i++) {
            if (b[i] > a[i]) {
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            } else {
                break;
            }
        }
        
        // Calculate and return the sum of array a
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        
        return sum;
    }
}

import java.util.*;

public class KuriyamaMiraiStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of stones
        int n = sc.nextInt();
        
        // Initialize arrays to store stone values and sorted stone values
        long[] arr = new long[n];
        long[] arr2 = new long[n];
        
        // Read the stone values into both arrays
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            arr2[i] = arr[i];  // Copy original array to arr2
        }
        
        // Sort the arr2 to create the sorted version of the stone values
        Arrays.sort(arr2);
        
        // Calculate prefix sums for both the original and sorted arrays
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];     // Cumulative sum for original array
            arr2[i] += arr2[i - 1];   // Cumulative sum for sorted array
        }
        
        // Input number of queries
        int q = sc.nextInt();
        
        // Process each query
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();  // Type of query (1 or 2)
            int l = sc.nextInt() - 1;  // Convert to 0-based index
            int r = sc.nextInt() - 1;  // Convert to 0-based index

            if (t == 1) {
                // Query on the original array
                if (l == 0) {
                    System.out.println(arr[r]);
                } else {
                    System.out.println(arr[r] - arr[l - 1]);
                }
            } else {
                // Query on the sorted array
                if (l == 0) {
                    System.out.println(arr2[r]);
                } else {
                    System.out.println(arr2[r] - arr2[l - 1]);
                }
            }
        }
        
        sc.close();
    }
}

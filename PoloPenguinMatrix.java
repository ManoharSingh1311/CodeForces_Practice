import java.util.*;

public class PoloPenguinMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read n, m, and d
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        int k = n * m; // Total number of elements in the matrix
        int[] arr = new int[k];

        // Read the matrix into a 1D array
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }

        // Check if all elements give the same remainder when divided by d
        int mod = arr[0] % d;
        for (int i = 1; i < k; i++) {
            if (arr[i] % d != mod) {
                System.out.println(-1);
                return;
            }
        }

        // Sort the array to find the median
        Arrays.sort(arr);

        // Median of the array
        int median = arr[k / 2];

        // Calculate the minimum number of moves to make all elements equal to the median
        int moves = 0;
        for (int i = 0; i < k; i++) {
            moves += Math.abs(arr[i] - median) / d;
        }

        // Output the total moves required
        System.out.println(moves);

        sc.close();
    }
}

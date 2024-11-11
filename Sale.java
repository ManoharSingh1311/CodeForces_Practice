import java.util.Arrays;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input n and m
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Input the array of TV prices
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array to bring negative prices to the front
        Arrays.sort(arr);

        int ans = 0;
        // Pick the first m negative values and calculate the profit
        for (int i = 0; i < m; i++) {
            if (arr[i] < 0) {
                ans += -arr[i]; // Add the absolute value of negative prices
            } else {
                break; // Stop if there are no more negative prices
            }
        }

        // Output the result
        System.out.println(ans);
    }
}

import java.util.Scanner;

public class BigSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arx = new int[n];
        int[] ary = new int[n];
        
        // Reading input
        for (int i = 0; i < n; i++) {
            arx[i] = sc.nextInt();
            ary[i] = sc.nextInt();
        }

        int minx = Integer.MAX_VALUE;
        int miny = Integer.MIN_VALUE;

        // If there is only one point, return 1
        if (n == 1) {
            System.out.println(1);
            return;
        }

        int ans = 0;
        int min2x = Integer.MAX_VALUE;
        int min2y = Integer.MIN_VALUE;

        // Iterating through the points
        for (int i = 0; i < n; i++) {
            if (minx >= arx[i] && miny <= ary[i]) {
                minx = arx[i];
                miny = ary[i];
                ans = i + 1;  // 1-based index
            }

            min2x = Math.min(min2x, arx[i]);
            min2y = Math.max(min2y, ary[i]);
        }

        // Checking if the condition is met
        if (min2x != minx || min2y != miny) {
            ans = -1;
        }

        System.out.println(ans);
    }
}

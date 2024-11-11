import java.util.Scanner;

public class KitaharaHarukisGift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Handle the special case where n = 1
        if (n == 1) {
            System.out.println("NO");
            return;
        }

        int ans = 0;
        int cnt_1 = 0;
        int cnt_2 = 0;

        // Count the number of elements divisible by 100 and those divisible by 200
        for (int i = 0; i < n; i++) {
            if (arr[i] / 100 == 1) {
                cnt_1++;
            } else {
                cnt_2++;
            }
        }

        String res;

        // Logic to determine the result based on the counts
        if (cnt_1 > 0 && cnt_2 > 0) {
            if (cnt_1 % 2 != 0 && cnt_2 % 2 != 0) {
                res = "NO";
            } else if (cnt_1 % 2 == 0 && cnt_2 % 2 == 0) {
                res = "YES";
            } else {
                for (int i = 0; i < n; i++) {
                    ans += arr[i] / 100;
                }

                if (ans % 2 == 0) {
                    res = "YES";
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        } else if (cnt_1 == 0) {
            if (cnt_2 % 2 != 0) {
                res = "NO";
            } else {
                res = "YES";
            }
        } else {  // cnt_2 == 0
            if (cnt_1 % 2 != 0) {
                res = "NO";
            } else {
                res = "YES";
            }
        }

        // Output the result
        System.out.println(res);
    }
}

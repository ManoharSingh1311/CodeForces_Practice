// Problem: Given a list of friends, each friend gives a gift to another friend. We are given the list of who receives
// gifts from whom. 
// The task is to find, for each friend, who gave them a gift. Output the list of friends who gave gifts to each friend.


import java.util.Scanner;

public class Presents {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            int temp = sc.nextInt();
            arr[temp] = i;
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve();
    }
}

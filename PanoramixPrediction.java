import java.util.Scanner;

public class PanoramixPrediction {

    // Method to check if a number is prime
    static boolean checkPrime(int x) {
        if (x == 2 || x == 3) {
            return true;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // yesterday's prime number
        int m = sc.nextInt();  // today's number
        
        // Check if m is a prime number
        if (!checkPrime(m)) {
            System.out.println("NO");
        } else {
            // Check if the next prime after n is m
            for (int i = n + 1; i <= m; i++) {
                if (checkPrime(i)) {
                    if (i == m) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                    break;
                }
            }
        }
        sc.close();
    }
}

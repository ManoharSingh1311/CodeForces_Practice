import java.util.Scanner;

public class TokitsukazeEnhancement {
    
    /**
     * Problem Explanation:
     * Tokitsukaze wants her HP to belong to the highest possible category 
     * based on the remainder when HP is divided by 4:
     * - Category A if remainder is 1 (highest)
     * - Category B if remainder is 3
     * - Category C if remainder is 2
     * - Category D if remainder is 0 (lowest)
     *
     * She can increase her HP by 0, 1, or 2 to achieve the highest category.
     * The task is to find the minimum increase (0, 1, or 2) to reach the highest category.
     */
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();

        if (n % 4 == 0)
            System.out.println("1 A");
        else if (n % 4 == 1)
            System.out.println("0 A");
        else if (n % 4 == 2)
            System.out.println("1 B");
        else if (n % 4 == 3)
            System.out.println("2 A");
    }

    public static void main(String[] args) {
        solve();
    }
}

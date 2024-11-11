import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Read the inputs
        int n = scanner.nextInt(); // Number of friends
        int k = scanner.nextInt(); // Number of bottles
        int l = scanner.nextInt(); // Milliliters per bottle
        int c = scanner.nextInt(); // Number of limes
        int d = scanner.nextInt(); // Slices per lime
        int p = scanner.nextInt(); // Grams of salt
        int nl = scanner.nextInt(); // Milliliters per toast
        int np = scanner.nextInt(); // Grams of salt per toast

        // Calculate the total number of toasts each ingredient can provide
        int totalDrinkToasts = (k * l) / nl; // Total toasts possible with the drink
        int totalLimeToasts = c * d; // Total toasts possible with lime slices
        int totalSaltToasts = p / np; // Total toasts possible with salt

        // Find the minimum of these three values
        int maxToasts = Math.min(Math.min(totalDrinkToasts, totalLimeToasts), totalSaltToasts);

        // The number of toasts each friend can make
        int toastsPerFriend = maxToasts / n;

        // Output the result
        System.out.println(toastsPerFriend);

        // Close the scanner
        scanner.close();
    }
}

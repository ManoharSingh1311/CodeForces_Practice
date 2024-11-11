import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodehorsesTshirts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of T-shirts
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Maps to store the frequency of T-shirt sizes
        Map<String, Integer> prevSizes = new HashMap<>();
        Map<String, Integer> currSizes = new HashMap<>();

        // Read the previous year's sizes
        for (int i = 0; i < n; i++) {
            String size = scanner.nextLine();
            prevSizes.put(size, prevSizes.getOrDefault(size, 0) + 1);
        }

        // Read the current year's sizes
        for (int i = 0; i < n; i++) {
            String size = scanner.nextLine();
            currSizes.put(size, currSizes.getOrDefault(size, 0) + 1);
        }

        // Count the number of changes needed
        int changes = n; // Initially assume we need to change all
        for (Map.Entry<String, Integer> entry : currSizes.entrySet()) {
            String size = entry.getKey();
            int currentCount = entry.getValue();
            int previousCount = prevSizes.getOrDefault(size, 0);

            // Decrease the changes by the minimum count in both lists
            changes -= Math.min(currentCount, previousCount);
        }

        // Print the result
        System.out.println(changes);
        scanner.close();
    }
}

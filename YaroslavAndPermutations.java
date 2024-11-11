import java.util.HashMap;
import java.util.Scanner;

public class YaroslavAndPermutations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements in the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Edge case: if there's only one element, it's already valid
        if (n == 1) {
            System.out.println("YES");
            return;
        }
        
        // Count the frequency of each element using a HashMap
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        
        // Check if any element appears more than (n + 1) / 2 times
        boolean isPossible = true;
        for (int count : freqMap.values()) {
            if (count > (n + 1) / 2) {
                isPossible = false;
                break;
            }
        }
        
        // Output the result
        if (isPossible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}

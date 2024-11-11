/*
Explanation of the Code:

1. We read the number of visitors and store the arrival times (hours and minutes) for each visitor in two arrays, `hr[]` and `mi[]`.

2. We initialize two variables:
   - `cash` to track the current number of cash registers required for visitors arriving at the same time.
   - `micash` to store the maximum number of cash registers required at any point during the day.

3. We loop through the visitors, starting from the second visitor. If two consecutive visitors arrive at the same time (same hours and minutes), we increase the `cash` counter. If the times differ, we compare the current number of required cash registers with the maximum (`micash`) and reset `cash` for the new time.

4. After looping, we ensure to update `micash` one last time to account for any matching times at the end of the list.

5. Finally, we output the maximum number of cash registers needed (`micash`) to serve all customers.
*/

import java.util.Scanner;

public class FreeCash {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Read the number of visitors
        int n = sc.nextInt();
        
        // Arrays to store the hours and minutes of visitors
        int[] hr = new int[n];
        int[] mi = new int[n];
        
        // Reading the input values for hours and minutes of each visitor
        for (int i = 0; i < n; i++) {
            hr[i] = sc.nextInt();
            mi[i] = sc.nextInt();
        }
        
        // Initialize two variables:
        // 'cash' tracks the current number of cashes needed for consecutive visitors arriving at the same time.
        // 'micash' stores the maximum number of cashes required so far.
        int cash = 1;
        int micash = 1;
        
        // Loop through all visitors starting from the second one (index 1)
        for (int i = 1; i < n; i++) {
            // Check if the current visitor comes at the same time as the previous one
            if (hr[i] == hr[i - 1] && mi[i] == mi[i - 1]) {
                cash++;  // If yes, increase the number of cash registers needed
            } else {
                // If the current time is different, update the maximum cashes required so far
                micash = Math.max(micash, cash);
                // Reset the 'cash' counter for the new time
                cash = 1;
            }
        }
        
        // After the loop, we must also compare the last 'cash' value with 'micash'
        micash = Math.max(micash, cash);
        
        // Output the result: the maximum number of cashes needed
        System.out.println(micash);
        
        // Close the scanner
        sc.close();
    }
}

/*
The solution reads a series of test cases where each case is a positive integer. For each integer, it breaks it down into the smallest 
possible set of "round numbers." A round number has only one non-zero digit followed by zeroes, like 4000 or 50. The code processes each 
integer digit by digit from right to left, forming round numbers by multiplying each non-zero digit by its place value
 (units, tens, hundreds, etc.). It then stores these round numbers in a list, counts them, and outputs the count followed by the round numbers for each test case in the required format. Finally, all results are printed at once for efficiency.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();  // Number of test cases
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            List<Integer> roundNumbers = new ArrayList<>();
            
            int multiplier = 1;
            while (n > 0) {
                int digit = n % 10;
                if (digit != 0) {
                    roundNumbers.add(digit * multiplier);
                }
                n /= 10;
                multiplier *= 10;
            }
            
            // Prepare the output for each test case
            result.append(roundNumbers.size()).append("\n");
            for (int num : roundNumbers) {
                result.append(num).append(" ");
            }
            result.append("\n");
        }
        
        // Print all results at once
        System.out.print(result.toString());
        
        scanner.close();
    }
}

import java.util.Scanner;

/**
 * Ultra-Fast Mathematician
 *
 * Problem description:
 * Given two binary numbers (composed of digits '0' and '1') of the same length, 
 * the task is to generate a new binary number such that for each digit, 
 * the corresponding digit in the output is '1' if the two input digits differ, 
 * and '0' if they are the same. This operation is performed bit by bit.
 *
 * Input: 
 * Two binary numbers (strings) of equal length.
 *
 * Output: 
 * A binary number (string) where each digit represents the XOR of the 
 * corresponding digits of the input numbers.
 *
 * Example:
 * Input:
 * 1010100
 * 0100101
 * Output:
 * 1110001
 */

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading two binary strings
        String ns = sc.nextLine();
        String ms = sc.nextLine();
        
        StringBuilder ans = new StringBuilder();
        
        // Iterating through each character of both strings
        for (int i = 0; i < ns.length(); i++) {
            // If characters differ, add '1' to result, else add '0'
            if (ns.charAt(i) != ms.charAt(i)) {
                ans.append('1');
            } else {
                ans.append('0');
            }
        }
        
        // Printing the result string
        System.out.println(ans.toString());
        
        sc.close();
    }
}

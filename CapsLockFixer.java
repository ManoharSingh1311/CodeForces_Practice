import java.util.Scanner;

public class CapsLockFixer {
    /*
     * Problem Statement:
     * The Caps Lock key on a keyboard can sometimes be accidentally pressed, 
     * leading to words being typed in uppercase letters when that was not intended. 
     * We need to determine if a given word has been typed with the Caps Lock on, 
     * based on the following criteria:
     * 
     * 1. The word consists entirely of uppercase letters.
     * 2. All letters except for the first one are uppercase.
     * 
     * If either condition is met, we should change the case of all letters in the word. 
     * For example, if the input is "hELLO", it should be transformed to "Hello". 
     * If the input cannot be transformed according to these rules, it should be left unchanged.
     * 
     * Input:
     * A single word consisting of uppercase and lowercase Latin letters (1 to 100 characters).
     * 
     * Output:
     * The processed word based on the rules defined above.
     */
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input word
        String s = scanner.nextLine();
        
        // Check if the word has all letters in uppercase (except the first letter)
        boolean allCaps = true;

        // Loop through the string starting from the second character
        for (int i = 1; i < s.length(); i++) {
            if (!Character.isUpperCase(s.charAt(i))) {
                allCaps = false;
                break; // If we find a lowercase letter, we can exit the loop
            }
        }

        // Check the first character and the allCaps condition
        if (!Character.isUpperCase(s.charAt(0)) && allCaps) {
            // If the first letter is lowercase and all others are uppercase
            // Change the case: first letter to uppercase, others to lowercase
            s = Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
            System.out.println(s);
        } else if (Character.isUpperCase(s.charAt(0)) && allCaps) {
            // If the first letter is uppercase and all others are uppercase
            // Change all letters to lowercase
            s = s.toLowerCase();
            System.out.println(s);
        } else {
            // If neither condition is met, print the word unchanged
            System.out.println(s);
        }
        
        scanner.close(); // Close the scanner to avoid resource leaks
    }
}

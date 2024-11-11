import java.util.Scanner;

public class PetyaAndStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Explanation:
        // Petya has two strings of equal length consisting of upper and lower case Latin letters.
        // The task is to compare the two strings lexicographically, ignoring the case of the letters.
        // If the first string is lexicographically smaller, we print "-1".
        // If the second string is smaller, we print "1".
        // If both are equal (ignoring case), we print "0".
        
        // Input: Two strings s1 and s2 of the same length.
        // We first convert both strings to lowercase (ignoring case for comparison).
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        // Convert both strings to lowercase for case-insensitive comparison
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        
        // Compare strings character by character
        int result = 0; // Default value if strings are equal
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) > s2.charAt(i)) {
                result = 1; // First string is lexicographically greater
                break;
            } else if (s1.charAt(i) < s2.charAt(i)) {
                result = -1; // Second string is lexicographically greater
                break;
            }
        }
        
        // Output the result: -1, 1, or 0
        System.out.println(result);
        
        sc.close();
    }
}

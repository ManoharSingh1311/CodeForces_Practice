import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnonymousLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read both input lines
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        // Create a map to store the frequency of characters in s1
        Map<Character, Integer> m = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            if (ch != ' ') {  // Skip spaces
                m.put(ch, m.getOrDefault(ch, 0) + 1);
            }
        }
        
        // Check if we can construct s2 from s1
        boolean canCompose = true;
        for (char ch : s2.toCharArray()) {
            if (ch != ' ') {  // Skip spaces
                if (!m.containsKey(ch) || m.get(ch) <= 0) {  // Not enough letters
                    canCompose = false;
                    break;
                } else {
                    m.put(ch, m.get(ch) - 1);  // Use one instance of this letter
                }
            }
        }
        
        // Output the result
        if (canCompose) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}

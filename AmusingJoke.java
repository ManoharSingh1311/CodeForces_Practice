import java.util.HashMap;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input guest's name, host's name, and pile of letters
        String guest = sc.next();
        String host = sc.next();
        String pile = sc.next();

        // Check if the total length of guest and host's names is equal to the pile of letters
        if (guest.length() + host.length() != pile.length()) {
            System.out.println("NO");
            return;
        }

        // Create a frequency map for guest and host's letters combined
        HashMap<Character, Integer> letterCount = new HashMap<>();
        for (char c : guest.toCharArray()) {
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }
        for (char c : host.toCharArray()) {
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }

        // Decrease the frequency of each letter found in the pile
        for (char c : pile.toCharArray()) {
            if (!letterCount.containsKey(c) || letterCount.get(c) == 0) {
                System.out.println("NO");
                return;
            }
            letterCount.put(c, letterCount.get(c) - 1);
        }

        // If all checks pass, print YES
        System.out.println("YES");
    }
}

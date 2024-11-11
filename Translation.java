import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the input words
        String s = sc.nextLine();
        String t = sc.nextLine();

        // Checking if the lengths of the two strings are not equal
        if (s.length() != t.length()) {
            System.out.println("NO");
            return;
        }

        // Checking if t is the reverse of s
        boolean flag = true;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != t.charAt(len - i - 1)) {
                flag = false;
                break;
            }
        }

        // Output the result
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

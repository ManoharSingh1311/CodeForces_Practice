import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Check if the first character is lowercase and convert it to uppercase
        if (Character.isLowerCase(s.charAt(0))) {
            s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        }

        System.out.println(s);
        sc.close();
    }
}

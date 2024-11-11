
 // Problem Summary:
        // We need to determine if a problem is "EASY" or "HARD" based on people's opinions.
        // Input:
        // - First line: integer n, the number of people who gave their opinions.
        // - Second line: n integers (either 0 or 1), where 0 means "easy" and 1 means "hard".
        // Output:
        // - "EASY" if all responses are 0.
        // - "HARD" if there's at least one response with a 1.
        
import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        boolean isHard = false;
        
        for (int i = 0; i < n; i++) {
            int opinion = scanner.nextInt();
            
            if (opinion == 1) {
                isHard = true;
                break;
            }
        }
        
        if (isHard) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
        
        scanner.close();
    }
}

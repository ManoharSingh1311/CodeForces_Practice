/*
 * Problem: Cinema Line
 * 
 * The clerk at a cinema is selling tickets to customers. Each ticket costs 25 rubles.
 * Customers can pay using 25, 50, or 100 ruble bills, but the clerk starts with no money.
 * The challenge is to determine whether the clerk can successfully give the correct change 
 * to every customer in the line, following these rules:
 * 
 * 1. If a customer pays with a 25 ruble bill, no change is required.
 * 2. If a customer pays with a 50 ruble bill, the clerk must give 25 rubles as change.
 * 3. If a customer pays with a 100 ruble bill, the clerk must give either:
 *    - One 50 ruble bill and one 25 ruble bill as change, or
 *    - Three 25 ruble bills if no 50 ruble bill is available.
 * 
 * The goal is to check if the clerk can give the correct change to every customer.
 * If yes, print "YES"; otherwise, print "NO".
 */
import java.util.Scanner;

public class CinemaLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of people in the line
        int cnt25 = 0, cnt50 = 0;  // Counters for 25 and 50 ruble bills
        boolean flag = true;  // To track if the clerk can give change

        for (int i = 0; i < n; i++) {
            int bill = sc.nextInt();  // The bill the current person is using to buy a ticket
            
            if (bill == 25) {
                cnt25++;  // If the person pays with 25 rubles, no change is needed
            } else if (bill == 50) {
                if (cnt25 > 0) {
                    cnt25--;  // Give change of 25 rubles
                    cnt50++;  // Collect the 50 ruble bill
                } else {
                    flag = false;  // Not enough 25 ruble bills to give change
                    break;
                }
            } else if (bill == 100) {
                if (cnt50 > 0 && cnt25 > 0) {
                    cnt50--;  // Give change of one 50 ruble bill
                    cnt25--;  // Give change of one 25 ruble bill
                } else if (cnt25 >= 3) {
                    cnt25 -= 3;  // Give change of three 25 ruble bills
                } else {
                    flag = false;  // Not enough change available
                    break;
                }
            }
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

/*
Problem Explanation:
Dima and his friends play a counting-out game to determine who will clean the apartment. Each person in the circle shows a number of fingers (1 to 5), and the total number of fingers is counted. Starting from Dima, they count around the circle using the total number of fingers, and the person where the counting stops must clean the apartment.

Dima knows how many fingers his friends will show, but he needs to figure out how many fingers he can show so that he does not have to clean. Dima will avoid cleaning if, after counting the total number of fingers shown by all friends and himself, the countdown does not stop on him.

Input:
- The first line contains an integer 'n', the number of Dima's friends.
- The second line contains 'n' integers (each between 1 and 5), representing how many fingers each friend shows.

Output:
- Print the number of ways Dima can show some number of fingers (1 to 5) such that he does not have to clean the apartment.

Logic:
- We sum the total number of fingers shown by Dima's friends.
- Then, for each number of fingers Dima could show (1 to 5), we check whether adding his fingers to the total and counting modulo (n + 1) (to include Dima himself in the circle) results in him not being chosen to clean.
- If the modulo result is not 1, it means the count does not stop on Dima, so that is a valid option for him.
*/

import java.util.Scanner;

public class DimaAndFriends {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner sc = new Scanner(System.in);

        // Read the number of Dima's friends
        int n = sc.nextInt();

        // Initialize a sum variable to store the total number of fingers shown by Dima's friends
        int sum = 0;

        // Read how many fingers each of Dima's friends shows, and sum them
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            sum += temp;
        }

        // Initialize a variable to store the number of ways Dima can avoid cleaning
        int ways = 0;

        // Check for each possible number of fingers Dima can show (1 to 5)
        for (int i = 1; i <= 5; i++) {
            // If the sum of fingers and Dima's choice results in Dima NOT having to clean, increase the count
            // The condition (sum + i) % (n + 1) != 1 ensures Dima is not chosen
            if ((sum + i) % (n + 1) != 1) {
                ways++;
            }
        }

        // Output the number of valid ways for Dima to avoid cleaning
        System.out.println(ways);
    }
}

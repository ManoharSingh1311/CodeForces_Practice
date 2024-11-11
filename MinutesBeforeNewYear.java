 /*
     * Problem Summary:
     * Given the current time in a 24-hour format (hours h and minutes m), 
     * calculate how many minutes remain until midnight (00:00), 
     * which marks the New Year.
     * 
     * Input:
     * - The first line contains an integer t, the number of test cases.
     * - Each test case consists of two integers, h (hours) and m (minutes).
     * 
     * Output:
     * - For each test case, output the number of minutes remaining until midnight.
     */

import java.util.Scanner;

public class MinutesBeforeNewYear {
    // The main method to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int t = sc.nextInt();

        // Loop over each test case
        for (int i = 0; i < t; i++) {
            // Read hours (h) and minutes (m)
            int h = sc.nextInt();
            int m = sc.nextInt();

            // Total minutes in a day (from 00:00 to 24:00) is 1440
            int totalMinutesInDay = 1440;

            // Calculate the current time in minutes from 00:00
            int currentTimeInMinutes = (h * 60) + m;

            // Calculate remaining minutes by subtracting current time from total minutes
            int minutesBeforeNewYear = totalMinutesInDay - currentTimeInMinutes;

            // Output the result for this test case
            System.out.println(minutesBeforeNewYear);
        }
        sc.close();
    }
}

/*
B. Drinks

Little Vasya loves orange juice and has n drinks in his fridge. Each drink contains a certain percentage of orange juice. He wants to mix equal proportions of all drinks and calculate the percentage of orange juice in the resulting cocktail.

Input:
- The first line contains an integer n (1 ≤ n ≤ 100) — the number of drinks.
- The second line contains n integers pi (0 ≤ pi ≤ 100) — the percentage of orange juice in each drink.

Output:
- Output the percentage of orange juice in the cocktail. The answer should have a precision of up to 10^-4.

Examples:
Input:
3
50 50 100
Output:
66.666666666667

Input:
4
0 25 50 75
Output:
37.500000000000
*/

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // Number of drinks
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextDouble();  // Sum of percentages of orange juice
        }

        // Calculate and print the average percentage of orange juice in the cocktail
        System.out.printf("%.12f\n", sum / n);

        sc.close();
    }
}

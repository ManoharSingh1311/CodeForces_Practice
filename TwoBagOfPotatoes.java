/*
    Problem Explanation:
    Valera had two bags of potatoes, one with x potatoes (the first bag) and another with y potatoes (the second bag). 
    Unfortunately, Valera lost the first bag. He remembers two things:
    1. The total number of potatoes in both bags (x + y) was less than or equal to n.
    2. The total number of potatoes (x + y) was divisible by k.

    We need to determine all the possible values of x (the number of potatoes in the first bag) 
    that satisfy the above two conditions, and print them in ascending order.
    
    Approach:
    1. We know the total number of potatoes in both bags was divisible by k, i.e., (x + y) % k == 0.
    2. The total number of potatoes x + y should not exceed n, i.e., x + y ≤ n.
    3. From these, we can derive that x must be equal to m * k - y, where m is an integer greater than 1. 
       Additionally, x must be positive and within the bound 0 < x ≤ n - y.
    
    Steps:
    1. Start with the first valid x, where m = 1 and compute x as m * k - y.
    2. Increment m to check subsequent values of x, until m * k - y exceeds n.
    3. For each valid x, check if it is positive and lies within the limit n - y.
    4. Print all valid x values, or if none are found, print -1.
    
    Time Complexity:
    The time complexity is O(n/k) as we iterate through the possible values of m.
*/

import java.util.Scanner;

public class TwoBagOfPotatoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int y = scanner.nextInt(); // Read y
        int k = scanner.nextInt(); // Read k
        int n = scanner.nextInt(); // Read n

        int first = (((y / k) + 1) * k) - y;
        
        if (n <= y || first + y > n) {
            System.out.println(-1);
            return;
        }

        for (int i = first; i <= n - y; i += k) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

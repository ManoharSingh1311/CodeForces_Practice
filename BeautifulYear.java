/*
Problem: Beautiful Year

You are given a year number, and your task is to find the smallest year strictly greater than the given one such that all the digits in the new year are distinct.

Input:
- y: An integer representing the year (1000 ≤ y ≤ 9000).

Output:
- Print the next year strictly greater than the input year where all the digits are distinct.

Steps:
1. Read the input year `y`.
2. Start from the year `y + 1` and check each successive year until all digits of the year are distinct.
3. Convert the year into a string and store its digits in a set.
4. If the size of the set (which stores unique characters) is equal to the length of the string, it means all digits are distinct.
5. Once such a year is found, print it and stop the loop.

Example:

Input:
1987

Output:
2013
Explanation:
The next year after 1987 where all digits are distinct is 2013.

Input:
2013

Output:
2014
Explanation:
All digits of 2014 are distinct, so it is the answer.
*/
import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the year
        int year = sc.nextInt();
        sc.close();

        // Keep finding the next year with distinct digits
        while (true) {
            year += 1;
            String yearStr = Integer.toString(year);

            // Use a HashSet to check for unique digits
            HashSet<Character> setYear = new HashSet<>();
            for (char c : yearStr.toCharArray()) {
                setYear.add(c);
            }

            // If all digits are distinct (size of set equals 4)
            if (setYear.size() == 4) {
                System.out.println(year);
                break;
            }
        }
    }
}
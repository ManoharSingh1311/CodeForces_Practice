/*
Problem: Helpful Maths

Xenia is a beginner in mathematics, and she can only compute sums if the numbers are arranged in non-decreasing order. 
You are given a string representing a sum of numbers (1, 2, and 3) separated by the plus sign ('+'). 
The task is to rearrange the sum so that the numbers appear in non-decreasing order.

Input:
- The input consists of a non-empty string `s` representing the sum Xenia needs to count.
- The string contains no spaces and only consists of digits ('1', '2', '3') and the plus sign ('+').

Output:
- Print the rearranged sum with numbers in non-decreasing order.

Examples:
Input: "3+2+1"
Output: "1+2+3"

Input: "1+1+3+1+3"
Output: "1+1+1+3+3"

Input: "2"
Output: "2"

Approach:
1. Split the string using the '+' delimiter and extract all numbers.
2. Convert them into integers and store them in an array or list.
3. Sort the list of integers.
4. Join the sorted numbers with the '+' delimiter and print the result.
*/

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input string
        String input = sc.nextLine();
        
        // Step 1: Split the input by '+'
        String[] numbers = input.split("\\+");  // Regex for '+' since it's a special character
        
        // Step 2: Convert to an integer array (or leave it as a String array, since it's easier for sorting)
        Arrays.sort(numbers);  // Sort the array in non-decreasing order
        
        // Step 3: Join the sorted array with '+'
        String result = String.join("+", numbers);
        
        // Step 4: Output the result
        System.out.println(result);
        
        sc.close();
    }
}

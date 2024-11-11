/* 
You are given a 5x5 matrix that contains 24 zeroes and a single '1'. The goal is to move this '1' to the center 
of the matrix (position (3, 3)). You can move the '1' by swapping neighboring rows or columns. 

Input:
- A 5x5 matrix where each element is either 0 or 1, and there is exactly one '1' in the matrix.

Output:
- Print the minimum number of moves required to move the '1' to the center of the matrix.

Steps:
1. Identify the position (i, j) of the '1'.
2. Calculate the Manhattan distance between the current position of '1' and the center (3, 3).
3. The Manhattan distance will give the minimum number of row and column swaps needed to bring '1' to the center.

Examples:

Input 1:
0 0 0 0 0
0 0 0 0 1
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0

Output 1:
3

Input 2:
0 0 0 0 0
0 0 0 0 0
0 1 0 0 0
0 0 0 0 0
0 0 0 0 0

Output 2:
1
*/

import java.util.Scanner;

public class beautiFulMatrix{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];  // 5x5 matrix
        int row = 0, col = 0;

        // Reading the matrix and finding the position of the '1'
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 1) {
                    row = i; // store the row index of '1'
                    col = j; // store the column index of '1'
                }
            }
        }

        // Calculating the minimum number of moves to bring '1' to the center (2, 2)
        int moves = Math.abs(2 - row) + Math.abs(2 - col);

        // Output the result
        System.out.println(moves);
        
        sc.close();
    }
}

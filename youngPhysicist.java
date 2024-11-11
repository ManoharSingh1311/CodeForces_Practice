/* Vasya needs to determine if a body in 3D space is in equilibrium given multiple force vectors. 
Each force vector is represented by its coordinates in 3D space. To find if the body is in equilibrium, 
you need to check if the sum of all force vectors equals the zero vector (0, 0, 0). 

Input:
- An integer n (1 ≤ n ≤ 100) indicating the number of force vectors.
- Followed by n lines, each containing three integers x_i, y_i, and z_i (-100 ≤ x_i, y_i, z_i ≤ 100), 
representing the coordinates of the force vector.

Output:
- Print "YES" if the body is in equilibrium (i.e., the sum of all vectors is (0, 0, 0)).
- Print "NO" if the sum is not zero.

Examples:

Input 1:
3
4 1 7
-2 4 -1
1 -5 -3

Output 1:
NO

Input 2:
3
3 -1 7
-5 2 -4
2 -1 -3

Output 2:
YES
*/

import java.util.Scanner;

public class youngPhysicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int x = 0, y = 0, z = 0;

        for (int i = 0; i < n; i++) {
            x += arr[i][0];
            y += arr[i][1];
            z += arr[i][2];
        }

        if (x == 0 && y == 0 && z == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}

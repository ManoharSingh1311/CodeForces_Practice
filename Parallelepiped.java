/*
 * Explanation of the Code:
 *
 * 1. The problem gives the areas of three faces of a rectangular parallelepiped that share a common vertex.
 *    The three areas correspond to the products of the lengths of three edges: (l1 * l2), (l2 * l3), and (l1 * l3).
 *
 * 2. Our task is to find the sum of the lengths of all 12 edges of the parallelepiped.
 *    The formula for calculating the sum of the lengths of the edges is:
 *    Sum of edges = 4 * (l1 + l2 + l3)
 *    Where l1, l2, and l3 are the lengths of the edges.
 *
 * 3. To determine l1, l2, and l3 from the given areas, we can use the following relations:
 *    - l1 = sqrt((area1 * area3) / area2)
 *    - l2 = sqrt((area1 * area2) / area3)
 *    - l3 = sqrt((area2 * area3) / area1)
 *
 * 4. After calculating l1, l2, and l3, we multiply their sum by 4 to get the total length of all edges.
 *
 * 5. The time complexity is O(1), since the problem involves a fixed number of operations.
 */

 import java.util.Scanner;

 public class Parallelepiped {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         // Input: the areas of the three faces
         double area1 = scanner.nextDouble();
         double area2 = scanner.nextDouble();
         double area3 = scanner.nextDouble();
 
         // Calculate the lengths of the edges using the given areas
         double l1 = Math.sqrt((area1 * area3) / area2);
         double l2 = Math.sqrt((area1 * area2) / area3);
         double l3 = Math.sqrt((area2 * area3) / area1);
 
         // Output the sum of all 12 edges
         int totalEdgeLength = (int) (4 * (l1 + l2 + l3));  // Convert to integer for final result
         System.out.println(totalEdgeLength);
     }
 }
 
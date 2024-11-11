import java.util.Scanner;

public class DzyLovesChessboard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading dimensions of the chessboard
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); // Consume the newline
        
        char[][] board = new char[n][m];
        
        // Reading the chessboard input
        for (int i = 0; i < n; i++) {
            board[i] = sc.nextLine().toCharArray();
        }
        
        // Processing each cell on the chessboard
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If the cell is a good cell ('.'), assign it either 'W' or 'B'
                if (board[i][j] == '.') {
                    // Alternating 'W' and 'B' in a checkerboard pattern
                    if ((i + j) % 2 == 0) {
                        board[i][j] = 'B'; // Black chessman
                    } else {
                        board[i][j] = 'W'; // White chessman
                    }
                }
                // Bad cells ('-') remain unchanged
            }
        }
        
        // Output the modified board
        for (int i = 0; i < n; i++) {
            System.out.println(board[i]);
        }
        
        sc.close();
    }
}

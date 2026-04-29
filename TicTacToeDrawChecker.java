public class TicTacToeDrawChecker {

    // Check if the game is a draw
    public static boolean isDraw(char[][] board) {

        // Loop through all cells
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // If any cell is empty → not a draw
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        // No empty cells → draw
        return true;
    }
}
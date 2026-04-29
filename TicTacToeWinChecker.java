public class TicTacToeWinChecker {

    public static boolean hasPlayerWon(char[][] board, char player) {

        // Rows check
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player) {
                return true;
            }
        }

        // Columns check
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player &&
                board[1][j] == player &&
                board[2][j] == player) {
                return true;
            }
        }

        // Diagonals
        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) {
            return true;
        }

        return false;
    }
}
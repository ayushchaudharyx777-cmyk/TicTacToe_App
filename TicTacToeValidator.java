public class TicTacToeValidator {

    // Method to validate move
    public static boolean isValidMove(int row, int col, char[][] board) {

        // Check boundaries
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != ' ') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        // Sample board
        char[][] board = {
                {'X', 'O', ' '},
                {' ', 'X', ' '},
                {'O', ' ', ' '}
        };

        int row = 1;
        int col = 2;

        if (isValidMove(row, col, board)) {
            System.out.println("Valid Move");
        } else {
            System.out.println("Invalid Move");
        }
    }
}
import java.util.Random;

public class TicTacToeComputer {

    // Method to generate random valid move
    public static int[] getRandomMove(char[][] board) {
        Random rand = new Random();
        int row, col;

        while (true) {
            int slot = rand.nextInt(9) + 1; // 1 to 9

            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            if (board[row][col] == ' ') {
                return new int[]{row, col};
            }
        }
    }

    // Print board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][] board = {
                {'X', 'O', ' '},
                {' ', 'X', ' '},
                {'O', ' ', ' '}
        };

        int[] move = getRandomMove(board);

        board[move[0]][move[1]] = 'O';

        System.out.println("Computer placed at: (" + move[0] + ", " + move[1] + ")");
        printBoard(board);
    }
}
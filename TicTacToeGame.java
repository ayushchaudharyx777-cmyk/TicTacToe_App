import java.util.Scanner;
import java.util.Random;

public class TicTacToeGame {

    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    // Print board
    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Check win
    public static boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol)
                return true;
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)
                return true;
        }

        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
            return true;

        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
            return true;

        return false;
    }

    // Check draw
    public static boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }

    // Player move
    public static void playerMove(Scanner sc) {
        int slot = sc.nextInt();
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            board[row][col] = 'X';
        } else {
            System.out.println("Invalid move! Try again.");
            playerMove(sc);
        }
    }

    // Computer move
    public static void computerMove() {
        Random rand = new Random();

        while (true) {
            int slot = rand.nextInt(9) + 1;
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (board[row][col] == ' ') {
                board[row][col] = 'O';
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            printBoard();

            System.out.print("Enter slot (1-9): ");
            playerMove(sc);

            if (checkWin('X')) {
                printBoard();
                System.out.println("Player wins!");
                break;
            }

            if (isDraw()) {
                printBoard();
                System.out.println("Game Draw!");
                break;
            }

            computerMove();

            if (checkWin('O')) {
                printBoard();
                System.out.println("Computer wins!");
                break;
            }

            if (isDraw()) {
                printBoard();
                System.out.println("Game Draw!");
                break;
            }
        }
    }
}
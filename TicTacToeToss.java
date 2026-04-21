import java.util.Random;

public class TicTacToeToss {

    public static void main(String[] args) {

        Random random = new Random();

        // Toss (0 or 1)
        int toss = random.nextInt(2);

        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol;
        char player2Symbol;
        String firstPlayer;

        if (toss == 0) {
            firstPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            firstPlayer = player2;
            player2Symbol = 'X';
            player1Symbol = 'O';
        }

        // Output
        System.out.println("Toss Result: " + toss);
        System.out.println(firstPlayer + " starts first!");
        System.out.println(player1 + " symbol: " + player1Symbol);
        System.out.println(player2 + " symbol: " + player2Symbol);
    }
}
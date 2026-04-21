import java.util.Scanner;

public class TicTacToeInput {

    public static void main(String[] args) {

        int slot = getUserInput();

        System.out.println("You selected slot: " + slot);
    }

    // Method to take input
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print("Enter a slot number (1-9): ");
            input = scanner.nextInt();

            if (input >= 1 && input <= 9) {
                return input;
            } else {
                System.out.println("Invalid input! Please enter a number between 1 and 9.");
            }
        }
    }
}
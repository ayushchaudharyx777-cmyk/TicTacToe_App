public class TicTacToeConverter {

    public static int getRow(int slot) {
        return (slot - 1) / 3;
    }

    public static int getCol(int slot) {
        return (slot - 1) % 3;
    }

    public static void main(String[] args) {
        int slot = 5; // test value

        if (slot < 1 || slot > 9) {
            System.out.println("Invalid slot!");
            return;
        }

        int row = getRow(slot);
        int col = getCol(slot);

        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }
}
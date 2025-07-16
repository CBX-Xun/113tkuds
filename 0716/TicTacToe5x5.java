import java.util.Scanner;

public class TicTacToe5x5 {
    static final int SIZE = 5;
    static char[][] board = new char[SIZE][SIZE];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initBoard();

        System.out.println("=== 5x5 井字遊戲 ===");
        printBoard();

        char currentPlayer = 'X';
        int moveCount = 0;

        while (true) {
            System.out.print("請玩家 " + currentPlayer + " 輸入位置 (row col): ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            // 檢查座標是否合法
            if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                System.out.println("❌ 座標超出範圍，請重新輸入！");
                continue;
            }
            if (board[row][col] != '.') {
                System.out.println("❌ 該位置已被佔用，請重新輸入！");
                continue;
            }

            // 下棋
            board[row][col] = currentPlayer;
            moveCount++;
            System.out.println("玩家 " + currentPlayer + " 在位置 (" + row + ", " + col + ") 放置棋子");
            printBoard();

            // 勝負判斷
            if (isWinner(currentPlayer)) {
                System.out.println("🎉 玩家 " + currentPlayer + " 獲勝！");
                break;
            }

            if (moveCount == SIZE * SIZE) {
                System.out.println("🤝 平手！");
                break;
            }

            // 換玩家
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        sc.close();
    }

    static void initBoard() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                board[i][j] = '.';
    }

    static void printBoard() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++)
            System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isWinner(char player) {
        // 橫向、直向
        for (int i = 0; i < SIZE; i++) {
            boolean rowWin = true, colWin = true;
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] != player)
                    rowWin = false;
                if (board[j][i] != player)
                    colWin = false;
            }
            if (rowWin || colWin)
                return true;
        }

        // 對角線
        boolean diag1 = true, diag2 = true;
        for (int i = 0; i < SIZE; i++) {
            if (board[i][i] != player)
                diag1 = false;
            if (board[i][SIZE - 1 - i] != player)
                diag2 = false;
        }
        return diag1 || diag2;
    }
}

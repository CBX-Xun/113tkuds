import java.util.*;

public class Q6_NightMarketMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = Integer.parseInt(sc.nextLine());  // 輸入幾個熱門攤位

        char[][] map = new char[10][10];
        // 預設全部填入 #
        for (int i = 0; i < 10; i++) {
            Arrays.fill(map[i], '#');
        }

        // 設定熱門攤位（*）
        for (int i = 0; i < m; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (row >= 0 && row < 10 && col >= 0 && col < 10) {
                map[row][col] = '*';
            }
            // 否則忽略超出範圍的點
        }

        // 印出地圖
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}

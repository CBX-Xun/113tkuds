import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][] cube = new int[n][n][n];

        int num = 1;
        // 填值
        for (int k = 0; k < n; k++) { // 第 k 層
            for (int i = 0; i < n; i++) { // 第 i 列
                for (int j = 0; j < n; j++) { // 第 j 行
                    cube[k][i][j] = num++;
                }
            }
        }

        // 依照題目的特殊格式輸出（按照 j, i, k 交錯轉置順序）
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // 顯示的是 cube[j][i][k]（由外向內）
                    System.out.print(cube[j][i][k]);
                    if (j != n - 1) System.out.print(" ");
                }
                System.out.println();
            }
            if (k != n - 1) {
                System.out.println(); // 層與層之間加一個空白行
            }
        }
    }
}

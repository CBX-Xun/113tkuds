import java.util.Scanner;
public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 原矩陣行數
        int m = sc.nextInt(); // 原矩陣列數

        int[][] matrix = new int[n][m];

        // 讀入原始矩陣
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // 轉置矩陣：將第 j 行第 i 列印出來
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[i][j]);
                if (i != n - 1) System.out.print(" ");
            }
            System.out.println(); // 換行
        }
    }
}

import java.util.Scanner;
public class q5matrixmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ops = 0;

        int n = sc.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];

        // 讀取 A 矩陣
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
                ops++;
            }

        // 讀取 B 矩陣
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
                ops++;
            }

        // 計算 C = A * B
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                    ops += 2; // 1乘法 + 1加法
                }
            }

        // 輸出結果矩陣
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(ops);
    }
}

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        int num = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (num <= n * n) {
            // 向右
            for (int i = left; i <= right && num <= n * n; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // 向下
            for (int i = top; i <= bottom && num <= n * n; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // 向左
            for (int i = right; i >= left && num <= n * n; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            // 向上
            for (int i = bottom; i >= top && num <= n * n; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        // 輸出結果
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
                if (j != n - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}

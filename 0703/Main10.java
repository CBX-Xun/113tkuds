import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();    // 行數
    int M = sc.nextInt();    // 列數

    int[] colSum = new int[M];
    // 讀入並同時計算每欄(column)的總和
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            int v = sc.nextInt();
            colSum[j] += v;
        }
    }

    // 輸出每一欄的總和，中間空格分隔
    for (int j = 0; j < M; j++) {
        System.out.print(colSum[j] + (j < M - 1 ? " " : ""));
    }
    System.out.println();  // 最後換行
}
}

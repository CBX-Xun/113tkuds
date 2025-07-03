import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();            // 讀入陣列長度
        int[] arr = new int[n];          // 建立陣列

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();       // 逐個讀入陣列元素
        }

        int max = arr[0];                // 設初始最大值
        int min = arr[0];                // 設初始最小值

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(max + " " + min); // 輸出最大值與最小值，中間用空格隔開
    }
}

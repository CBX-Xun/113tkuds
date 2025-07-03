import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 陣列長度
        int[] arr = new int[n];

        // 讀入陣列
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 倒著印出來
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
        System.out.println(); // 換行結尾
    }
}

import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 輸入整數 N

        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;

            // 檢查 i 是否為質數
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false; // 有因數 → 非質數
                    break;           // 提早結束迴圈
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

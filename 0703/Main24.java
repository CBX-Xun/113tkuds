import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 讀入非負整數 n (0 <= n <= 12)
        int result = 1;        // 階乘結果初始為 1

        int i = 1;
        while (i <= n) {
            result *= i;       // 累乘
            i++;
        }

        System.out.println(result);  // 輸出階乘結果
    }
}

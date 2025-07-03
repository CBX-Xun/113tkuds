import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 讀取使用者輸入
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) { // 判斷偶數
                sum += i;
            }
        }

        System.out.println(sum); // 輸出總和
    }
}

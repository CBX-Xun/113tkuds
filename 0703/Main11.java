import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 讀取金字塔高度
        for (int i = 1; i <= N; i++) {
            boolean first = true;
            // 先輸出 1,2,3,...,i
            for (int j = 1; j <= i; j++) {
                if (first) {
                    System.out.print(j);
                    first = false;
                } else {
                    System.out.print(" " + j);
                }
            }
            // 再輸出 i-1, i-2, ..., 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(" " + j);
            }
            System.out.println();  // 換行
        }
        sc.close();
    }
}

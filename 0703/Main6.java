import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0);  // 讀取一個字元
        int ascii = (int) ch;                // 強制轉型為 ASCII 值
        System.out.println(ascii);
    }
}

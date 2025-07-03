import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt();         // 輸入攝氏溫度
        int fahrenheit = (celsius * 9 / 5) + 32;  // 計算華氏
        System.out.println(fahrenheit);     // 輸出華氏溫度
    }
}

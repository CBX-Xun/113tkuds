import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();  // 輸入一個年份

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

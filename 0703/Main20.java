import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();  // 輸入半徑
        double area = 3.14 * radius * radius;

        System.out.printf("%.2f\n", area);  // 小數點後2位輸出
    }
}

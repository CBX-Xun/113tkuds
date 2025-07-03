import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intNum = sc.nextInt();
        double doubleNum = sc.nextDouble();

        double result = intNum + doubleNum;
        System.out.printf("%.2f\n", result);
    }
}

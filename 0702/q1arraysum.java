import java.util.Scanner;
public class q1arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ops = 0;

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            ops++;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            ops++;
        }

        System.out.println(sum);
        System.out.println(ops);
    }
}

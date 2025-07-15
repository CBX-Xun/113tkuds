import java.util.Scanner;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum = 0;
        System.out.print("PrefixSum:");
        for (int i = 0; i < k; i++) {
            sum += a[i];
            System.out.print(" " + sum);
        }
        System.out.println();
        sc.close();
    }
}

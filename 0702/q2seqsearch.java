import java.util.Scanner;
public class q2seqsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ops = 0;

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            ops++;
        }

        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            ops++;
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Yes" : "No");
        System.out.println(ops);
    }
}

import java.util.Scanner;
public class q3binsearch {
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
        int left = 0, right = n - 1, result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            ops++;
            if (arr[mid] == key) {
                result = mid;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);
        System.out.println(ops);
    }
}

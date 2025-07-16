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
            sum += a[i]; // 前 i 場勝場加總
            System.out.print(" " + sum);
        }

        System.out.println();
        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * 1. 讀入 n 筆比賽資料耗時 O(n)。
 * 2. 接著輸出前 k 場勝場加總（prefix sum），最多 O(k) 次加法與輸出。
 * 3. 若 k ≈ n，整體處理為 O(n)。
 * 4. 所以總體時間複雜度為 O(n)。
 */


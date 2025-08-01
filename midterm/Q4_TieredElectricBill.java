import java.util.*;

public class Q4_TieredElectricBill {
    static int calc(int k) {
        double bill = 0;
        int rem = k;
        int[] limits = {120, 210, 170, 200, 300};
        double[] rates = {1.68, 2.45, 3.70, 5.04, 6.24};
        for (int i = 0; i < limits.length; i++) {
            int use = Math.min(rem, limits[i]);
            bill += use * rates[i];
            rem -= use;
            if (rem <= 0) break;
        }
        if (rem > 0) {
            bill += rem * 8.46;
        }
        return (int) Math.round(bill);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] kwhList = new int[n];
        for (int i = 0; i < n; i++) {
            kwhList[i] = sc.nextInt(); // 先全部輸入完
        }

        int sum = 0;
        int[] bills = new int[n];
        for (int i = 0; i < n; i++) {
            bills[i] = calc(kwhList[i]); // 分段計算
            sum += bills[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Bill: $" + bills[i]);
        }

        System.out.println("Total: $" + sum);
        System.out.println("Average: $" + (int) Math.round((double) sum / n));

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * 1. 主程式需處理 n 筆輸入資料，每筆資料呼叫一次 calc(k)，為固定最多 6 段電價計算。
 * 2. 每次 calc() 的處理量為常數時間 O(1)。
 * 3. 因此總體時間複雜度為 O(n)，與輸入筆數成線性關係。
 */

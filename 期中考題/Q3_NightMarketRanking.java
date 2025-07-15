import java.util.*;

public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(sc.nextLine());
        }

        // 選擇排序（由大到小）
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] > scores[maxIdx]) {
                    maxIdx = j;
                }
            }
            // 交換
            double tmp = scores[i];
            scores[i] = scores[maxIdx];
            scores[maxIdx] = tmp;
        }

        // 印出前 5 名（或全部）
        for (int i = 0; i < Math.min(5, n); i++) {
            System.out.printf("%.1f\n", scores[i]);
        }

        sc.close();
    }
}

/*
 * Time Complexity: O(n^2)
 * 說明：使用選擇排序（Selection Sort），每回合需與剩餘 n-i 項比大小，共需 n(n-1)/2 次比較。
 */

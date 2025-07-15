package 期中考題;
import java.util.*;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];
        String[] timeStrs = new String[n];

        for (int i = 0; i < n; i++) {
            timeStrs[i] = sc.nextLine(); // 保留原始字串
            times[i] = toMinutes(timeStrs[i]); // 換算成總分鐘
        }

        String queryStr = sc.nextLine();
        int query = toMinutes(queryStr);

        // 二分搜尋找出第一個 > query 的班次
        int left = 0, right = n;
        while (left < right) {
            int mid = (left + right) / 2;
            if (times[mid] > query) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        if (left == n) {
            System.out.println("No train");
        } else {
            System.out.println(timeStrs[left]);
        }

        sc.close();
    }

    // 將 HH:mm 轉為分鐘
    public static int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：以二分搜尋方式尋找第一個 > query 的開車時間，因此複雜度為 log n。
 */

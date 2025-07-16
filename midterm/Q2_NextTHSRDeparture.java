import java.util.*;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];
        String[] timeStrs = new String[n];

        for (int i = 0; i < n; i++) {
            timeStrs[i] = sc.nextLine();           // 原始時間字串
            times[i] = toMinutes(timeStrs[i]);     // 轉換成分鐘數
        }

        String queryStr = sc.nextLine();
        int query = toMinutes(queryStr);

        // 使用 binary search 找第一個 > query 的時刻
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

    // 將 "HH:mm" 字串轉換為分鐘數
    public static int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：
 * 1. 時刻表已排序，程式使用 binary search (二分搜尋) 找出第一個大於 query 的班次時間。
 * 2. 二分搜尋時間複雜度為 O(log n)，查詢最快只需 log₂(n) 次比較。
 * 3. 時間轉換與輸出操作皆為 O(1)，不影響整體主流程複雜度。
 * 4. 故總體時間複雜度為 O(log n)。
 */

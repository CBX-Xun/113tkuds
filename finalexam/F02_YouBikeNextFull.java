import java.util.*;

public class F02_YouBikeNextFull {
    // 將 HH:mm 字串轉成總分鐘
    static int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    // 將分鐘數轉回 HH:mm 字串
    static String toTime(int minutes) {
        int h = minutes / 60;
        int m = minutes % 60;
        return String.format("%02d:%02d", h, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];

        for (int i = 0; i < n; i++) {
            times[i] = toMinutes(sc.nextLine());
        }

        int query = toMinutes(sc.nextLine());

        // 二分搜尋：找第一個 > query 的時間
        int left = 0, right = n - 1;
        int answer = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (times[mid] > query) {
                answer = times[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (answer == -1) {
            System.out.println("No bike");
        } else {
            System.out.println(toTime(answer));
        }

        sc.close();
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：使用二分搜尋找第一個大於查詢值的位置，因此時間複雜度為 O(log n)。
 */

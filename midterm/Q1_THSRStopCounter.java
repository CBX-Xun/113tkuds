import java.util.*;

public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine()); // 讀取停靠站數
        String[] stops = sc.nextLine().split(" "); // 停靠站代碼陣列
        String[] se = sc.nextLine().split(" "); // 起點與終點代碼

        String start = se[0];
        String end = se[1];

        int startIdx = -1;
        int endIdx = -1;

        // 找出 start 與 end 在停靠站中的位置（線性掃描 O(n)）
        for (int i = 0; i < n; i++) {
            if (stops[i].equals(start)) {
                startIdx = i;
            }
            if (stops[i].equals(end)) {
                endIdx = i;
            }
        }

        // 若任一站點不存在
        if (startIdx == -1 || endIdx == -1) {
            System.out.println("Invalid");
        } else {
            // 使用絕對值計算站數：包含起點與終點 → +1
            int count = Math.abs(startIdx - endIdx) + 1;
            System.out.println(count);
        }

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * 1. 程式需線性掃描停靠站陣列，找出起點與終點的 index（最壞需掃完全部 n 個站）。
 * 2. 比對次數為 O(n)，其餘計算如 Math.abs() 為 O(1)。
 * 3. 因此總時間複雜度為 O(n)。
 */

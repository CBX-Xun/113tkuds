import java.util.*;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 站數
        String[] stations = new String[n];

        for (int i = 0; i < n; i++) {
            stations[i] = sc.next();
        }

        String start = sc.next();
        String end = sc.next();

        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < n; i++) {
            if (stations[i].equals(start)) {
                startIndex = i;
            }
            if (stations[i].equals(end)) {
                endIndex = i;
            }
        }

        if (startIndex == -1 || endIndex == -1) {
            System.out.println("Invalid");
        } else {
            int count = Math.abs(startIndex - endIndex) + 1;
            System.out.println(count);
        }

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：需線性掃描陣列一次以尋找 start 與 end 的 index，最壞情況下需掃完全部 n 個站。
 */

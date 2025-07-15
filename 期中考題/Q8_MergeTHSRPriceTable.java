import java.util.*;

public class Q8_MergeTHSRPriceTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] station = new String[n];
        int[][] price = new int[n][2]; // [][0] 是標準票價，[][1] 是商務票價

        for (int i = 0; i < n; i++) {
            station[i] = sc.next();       // 站名
            price[i][0] = sc.nextInt();   // 標準票價
            price[i][1] = sc.nextInt();   // 商務票價
        }

        // 輸出標題
        System.out.println("Station|Standard|Business");

        // 輸出每一列
        for (int i = 0; i < n; i++) {
            System.out.printf("%s|%d|%d\n", station[i], price[i][0], price[i][1]);
        }

        sc.close();
    }
}

import java.util.*;

public class F03_ConvenienceHotItems {
    static class Item {
        String name;
        int qty;

        Item(String name, int qty) {
            this.name = name;
            this.qty = qty;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine(); // 讀完 n 後消除換行

        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];
            int qty = Integer.parseInt(parts[1]);
            items[i] = new Item(name, qty);
        }

        // 插入排序由高到低
        for (int i = 1; i < n; i++) {
            Item key = items[i];
            int j = i - 1;
            while (j >= 0 && items[j].qty < key.qty) {
                items[j + 1] = items[j];
                j--;
            }
            items[j + 1] = key;
        }

        // 輸出前 10 名
        int outputCount = Math.min(10, n);
        for (int i = 0; i < outputCount; i++) {
            System.out.println(items[i].name + " " + items[i].qty);
        }

        sc.close();
    }
}

/*
 * Time Complexity: O(n^2)
 * 說明：使用插入排序處理 n 筆資料，最壞情況下每次插入都需移動整個已排序區段，因此是平方時間。
 */

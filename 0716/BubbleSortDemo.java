class BubbleSortDemo {

    /**
     * 基本氣泡排序實作
     * 時間複雜度：最佳 O(n)，最壞 O(n²)，平均 O(n²)
     * 空間複雜度：O(1)
     * 穩定性：穩定排序
     *
     * 複雜度說明：
     * Time Complexity: O(n^2)
     * 說明：
     * 1. 最壞情況：完全逆序，需要進行 n-1 輪，每輪最多比較 n-i 次 → O(n²)
     * 2. 最佳情況：已排序，每輪都沒交換，提早結束 → O(n)
     * 3. 平均情況：約為 n(n-1)/2 次比較 → O(n²)
     */
    static void bubbleSort(int[] array) {
        int n = array.length;
        int totalComparisons = 0;
        int totalSwaps = 0;

        System.out.println("氣泡排序過程：");

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            int roundComparisons = 0;
            int roundSwaps = 0;

            System.out.printf("\n第 %d 輪排序：\n", i + 1);

            for (int j = 0; j < n - i - 1; j++) {
                roundComparisons++;
                totalComparisons++;

                System.out.printf("比較 array[%d]=%d 與 array[%d]=%d ",
                        j, array[j], j + 1, array[j + 1]);

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                    roundSwaps++;
                    totalSwaps++;
                    System.out.println("→ 交換");
                } else {
                    System.out.println("→ 不交換");
                }
            }

            System.out.printf("第 %d 輪結束：比較 %d 次，交換 %d 次\n",
                    i + 1, roundComparisons, roundSwaps);
            System.out.println("目前陣列：" + java.util.Arrays.toString(array));

            if (!swapped) {
                System.out.println("提早結束：陣列已經排序完成");
                break;
            }
        }

        System.out.printf("\n排序完成！總比較次數：%d，總交換次數：%d\n",
                totalComparisons, totalSwaps);
    }

    /**
     * 改良版氣泡排序：雙向氣泡排序（雞尾酒排序）
     *
     * 複雜度說明：
     * Time Complexity: O(n^2)
     * 說明：
     * 1. 最壞情況仍需掃描左右兩邊 n 次 → O(n²)
     * 2. 最佳情況：已排序，來回都沒有交換 → O(n)
     * 3. 空間複雜度為 O(1)，屬於原地排序
     */
    static void cocktailSort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        boolean swapped = true;

        System.out.println("\n雞尾酒排序過程：");

        while (swapped && left < right) {
            swapped = false;

            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
            left++;

            System.out.println("目前陣列：" + java.util.Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] numbers1 = {64, 34, 25, 12, 22, 11, 90};
        int[] numbers2 = numbers1.clone();

        System.out.println("原始陣列：" + java.util.Arrays.toString(numbers1));

        System.out.println("\n=== 基本氣泡排序 ===");
        bubbleSort(numbers1);
        System.out.println("最終結果：" + java.util.Arrays.toString(numbers1));

        System.out.println("\n=== 雞尾酒排序 ===");
        cocktailSort(numbers2);
        System.out.println("最終結果：" + java.util.Arrays.toString(numbers2));
    }
}

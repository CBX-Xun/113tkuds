class InsertionSortDemo {
    /**
     * 插入排序實作
     * 
     * Time Complexity: 
     * 最佳情況 O(n) - 已排序情況下，每個元素只比較一次
     * 最壞情況 O(n²) - 反向排序時，每次插入都需移動所有已排序元素
     * 平均情況 O(n²) - 對每個元素平均需要比較 n/2 次
     * 
     * 空間複雜度：O(1) - 原地排序，不使用額外空間
     * 穩定性：穩定排序
     * 特點：對於小規模或部分排序的資料效率很高
     */
    static void insertionSort(int[] array) {
        int n = array.length;
        int totalComparisons = 0;
        int totalShifts = 0;
        
        System.out.println("插入排序過程：");
        System.out.println("已排序部分 | 未排序部分");
        System.out.println("------------|------------");
        
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            
            System.out.printf("\n第 %d 步：插入元素 %d\n", i, key);
            System.out.print("插入前：");
            for (int k = 0; k < i; k++) System.out.print(array[k] + " ");
            System.out.print("| ");
            for (int k = i; k < n; k++) {
                if (k == i) System.out.print("[" + array[k] + "] ");
                else System.out.print(array[k] + " ");
            }
            System.out.println();
            
            while (j >= 0 && array[j] > key) {
                totalComparisons++;
                System.out.printf("  比較 %d > %d，將 %d 向右移動\n", array[j], key, array[j]);
                array[j + 1] = array[j];
                totalShifts++;
                j--;
            }
            if (j >= 0) totalComparisons++;
            array[j + 1] = key;
            System.out.printf("  將 %d 插入到位置 %d\n", key, j + 1);
            
            System.out.print("插入後：");
            for (int k = 0; k <= i; k++) System.out.print(array[k] + " ");
            System.out.print("| ");
            for (int k = i + 1; k < n; k++) System.out.print(array[k] + " ");
            System.out.println();
        }
        
        System.out.printf("\n排序完成！總比較次數：%d，總移動次數：%d\n", 
                        totalComparisons, totalShifts);
    }

    /**
     * 二分插入排序
     * 
     * Time Complexity: O(n²)
     * 說明：
     * - 使用二分搜尋插入位置需 O(log n)
     * - 但仍需搬移元素 O(n) 次
     * - 所以總體仍是 O(n × n) = O(n²)
     * 
     * 空間複雜度：O(1)
     * 穩定性：穩定排序
     * 特點：比較次數較少，但位移次數不變
     */
    static void binaryInsertionSort(int[] array) {
        System.out.println("\n二分插入排序過程：");
        
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int insertPos = binarySearchInsertPosition(array, 0, i - 1, key);
            
            System.out.printf("將 %d 插入到位置 %d\n", key, insertPos);
            
            for (int j = i; j > insertPos; j--) {
                array[j] = array[j - 1];
            }
            
            array[insertPos] = key;
            System.out.println("目前陣列：" + java.util.Arrays.toString(array));
        }
    }

    /**
     * 二分搜尋找插入位置
     * 
     * Time Complexity: O(log n)
     * 說明：每次將範圍對半切找位置
     */
    static int binarySearchInsertPosition(int[] array, int left, int right, int key) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] <= key) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] numbers1 = {64, 34, 25, 12, 22, 11, 90};
        int[] numbers2 = numbers1.clone();
        
        System.out.println("原始陣列：" + java.util.Arrays.toString(numbers1));
        
        System.out.println("\n=== 基本插入排序 ===");
        insertionSort(numbers1);
        System.out.println("最終結果：" + java.util.Arrays.toString(numbers1));
        
        System.out.println("\n=== 二分插入排序 ===");
        binaryInsertionSort(numbers2);
        System.out.println("最終結果：" + java.util.Arrays.toString(numbers2));
    }
}

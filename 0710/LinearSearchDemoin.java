import java.util.Scanner;

class LinearSearchDemoin {
    /**
     * 基本線性搜尋：找到第一個符合的元素
     * 時間複雜度：最佳 O(1)，最壞 O(n)，平均 O(n/2)
     * 空間複雜度：O(1)
     */
    static int linearSearch(int[] array, int target) {
        int comparisons = 0;
        
        for (int i = 0; i < array.length; i++) {
            comparisons++;
            System.out.printf("第 %d 次比較：array[%d] = %d，目標值 = %d\n", 
                            comparisons, i, array[i], target);
            
            if (array[i] == target) {
                System.out.printf("找到目標值！總共比較了 %d 次\n", comparisons);
                return i;
            }
        }
        
        System.out.printf("找不到目標值，總共比較了 %d 次\n", comparisons);
        return -1;
    }
    

    static int[] linearSearchAll(int[] array, int target) {
        int count = 0;
        for (int value : array) {
            if (value == target) {
                count++;
            }
        }
        
        if (count == 0) {
            return new int[0];
        }
        
        int[] result = new int[count];
        int resultIndex = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                result[resultIndex++] = i;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入陣列長度：");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("請輸入陣列的元素：");
        for (int i = 0; i < n; i++) {
            System.out.printf("第 %d 個元素：", i);
            numbers[i] = scanner.nextInt();
        }

        System.out.print("請輸入搜尋目標值：");
        int target = scanner.nextInt();
        
        System.out.println("陣列內容：" + java.util.Arrays.toString(numbers));
        System.out.println("搜尋目標：" + target);
        System.out.println();
        
        System.out.println("=== 基本線性搜尋 ===");
        int result = linearSearch(numbers, target);
        
        if (result != -1) {
            System.out.printf("在索引位置 %d 找到目標值 %d\n", result, target);
        } else {
            System.out.printf("找不到目標值 %d\n", target);
        }
        
        System.out.println("\n=== 搜尋所有符合位置 ===");
        int[] allPositions = linearSearchAll(numbers, target);
        
        if (allPositions.length > 0) {
            System.out.printf("目標值 %d 出現在以下位置：", target);
            for (int i = 0; i < allPositions.length; i++) {
                System.out.print(allPositions[i]);
                if (i < allPositions.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.printf("\n總共出現 %d 次\n", allPositions.length);
        } else {
            System.out.printf("找不到目標值 %d\n", target);
        }
    }
}
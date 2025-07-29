import java.util.*;

public class F06_ArraySecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = findMaxSecond(arr, 0, n - 1);
        System.out.println("SecondMax: " + result[1]);
        sc.close();
    }

    // 回傳 [最大值, 第二大]
    static int[] findMaxSecond(int[] arr, int left, int right) {
        if (left == right) return new int[]{arr[left], Integer.MIN_VALUE};

        int mid = (left + right) / 2;
        int[] leftRes = findMaxSecond(arr, left, mid);
        int[] rightRes = findMaxSecond(arr, mid + 1, right);

        int max, second;
        if (leftRes[0] > rightRes[0]) {
            max = leftRes[0];
            second = Math.max(leftRes[1], rightRes[0]);
        } else if (leftRes[0] < rightRes[0]) {
            max = rightRes[0];
            second = Math.max(rightRes[1], leftRes[0]);
        } else {
            max = leftRes[0];
            second = Math.max(leftRes[1], rightRes[1]);
        }

        return new int[]{max, second};
    }
}

/*
 * Time Complexity: O(n)
 * 說明：使用 divide-and-conquer 分治法，每層切半，合併花常數時間，整體為 O(n)。
 */

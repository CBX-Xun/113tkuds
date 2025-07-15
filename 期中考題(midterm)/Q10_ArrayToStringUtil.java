import java.util.*;

public class Q10_ArrayToStringUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] arr = null;
        if (n > 0) {
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.println(arrayToString(arr));
        sc.close();
    }

    // 仿 Arrays.toString()
    static String arrayToString(int[] arr) {
        if (arr == null) return "null";
        if (arr.length == 0) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            sb.append(", ").append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}

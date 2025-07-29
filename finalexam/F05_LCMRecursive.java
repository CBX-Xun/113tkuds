import java.util.*;

public class F05_LCMRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = getGCD(a, b);
        int lcm = a * b / gcd;
        System.out.println("LCM: " + lcm);
        sc.close();
    }

    static int getGCD(int a, int b) {
        if (a == b) return a;
        if (a > b) return getGCD(a - b, b);
        else return getGCD(a, b - a);
    }
}

/*
 * Time Complexity: O(max(a, b))
 * 說明：輾轉相減法最壞每次只減 1，故最多要執行 max(a,b) 次遞迴，時間複雜度為 O(max(a,b))。
 */

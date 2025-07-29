import java.util.*;

public class F08_ClimbStairsMemo {
    static int[] memo = new int[41];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Arrays.fill(memo, -1);
        int result = dp(n);
        System.out.println("Ways: " + result);
        sc.close();
    }

    static int dp(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        if (memo[n] != -1) return memo[n];
        return memo[n] = dp(n - 1) + dp(n - 2) + dp(n - 3);
    }
}

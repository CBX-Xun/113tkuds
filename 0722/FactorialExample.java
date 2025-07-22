public class FactorialExample {
    // 回傳 n! 的值，並記錄每一步的乘數
    public static int factorial(int n, StringBuilder steps) {
        if (n <= 1) {
            steps.append("1");
            return 1;
        }

        steps.append(n).append(" * ");
        int result = factorial(n - 1, steps);
        return n * result;
    }

    public static void printFactorialProcess(int n) {
        StringBuilder steps = new StringBuilder();
        int result = factorial(n, steps);

        // 印出完整過程與結果
        System.out.println(n + "! = " + steps.toString() + " = " + result);
    }

    public static void main(String[] args) {
        printFactorialProcess(3); // 輸出：3! = 3 * 2 * 1 = 6
        printFactorialProcess(5); // 輸出：5! = 5 * 4 * 3 * 2 * 1 = 120
        printFactorialProcess(0); // 輸出：0! = 1 = 1
    }
}

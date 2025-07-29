import java.util.*;

public class F04_TieredIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] incomes = new int[n];
        int[] taxes = new int[n];
        double totalTax = 0;

        for (int i = 0; i < n; i++) {
            incomes[i] = sc.nextInt();
            taxes[i] = calcTax(incomes[i]);
            totalTax += taxes[i];
        }

        for (int tax : taxes) {
            System.out.println("Tax: $" + tax);
        }

        double avg = totalTax / n;
        System.out.printf("Average: $%.2f\n", avg);

        sc.close();
    }

    static int calcTax(int income) {
        int tax = 0;
        if (income <= 560000) {
            tax = (int)(income * 0.05);
        } else if (income <= 1260000) {
            tax = (int)(560000 * 0.05 + (income - 560000) * 0.12);
        } else if (income <= 2520000) {
            tax = (int)(560000 * 0.05 + (1260000 - 560000) * 0.12 + (income - 1260000) * 0.2);
        } else if (income <= 4720000) {
            tax = (int)(560000 * 0.05 + (1260000 - 560000) * 0.12 + 
                        (2520000 - 1260000) * 0.2 + (income - 2520000) * 0.3);
        } else {
            tax = (int)(560000 * 0.05 + (1260000 - 560000) * 0.12 + 
                        (2520000 - 1260000) * 0.2 + (4720000 - 2520000) * 0.3 +
                        (income - 4720000) * 0.4);
        }
        return tax;
    }
}

/*
 * Time Complexity: O(n)
 * 說明：每筆收入呼叫 calcTax 為常數時間，總共處理 n 筆收入，因此為 O(n)。
 */

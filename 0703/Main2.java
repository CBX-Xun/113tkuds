import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        sc.close();

        String[] parts = line.split("\\+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        int total = a+b;
        System.out.println(total);
    }
}

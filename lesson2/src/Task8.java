import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        int n = sc.nextInt();
        int step = n - 1;
        while (n <= 0) {
            System.out.println("The number has to be with positive value!");
            System.out.println("Please, enter a number: ");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(step);
            }
            step += 2;
            System.out.println();

        }
    }
}

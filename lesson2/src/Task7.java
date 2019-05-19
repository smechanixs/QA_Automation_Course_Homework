import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("The number has to be with positive value!");
            System.out.println("Please, enter a number: ");
            n = sc.nextInt();
        }

        for (int i = 3; i <= n * 3; i += 3) {
            if (i % 3 == 0) {
                System.out.print(i);
            }
            if (i < n * 3) {
                System.out.print(", ");
            }
        }

    }
}


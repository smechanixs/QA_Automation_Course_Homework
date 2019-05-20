import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        while (num < 1) {
            System.out.println("Please enter enter a number bigger than 1: ");
            num = sc.nextInt();
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("The number is PRIME!");
        } else {
            System.out.println("The number is NOT PRIME!");
        }

    }
}

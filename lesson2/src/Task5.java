import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Please, enter a second number: ");
        int num2 = sc.nextInt();
        if (num1 < num2) {
            while (num1 <= num2) {
                System.out.println(num1);
                num1++;
            }
        } else {
            while (num1 >= num2) {
                System.out.println(num2);
                num2++;
            }
        }
    }
}
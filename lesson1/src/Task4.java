import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Please type first number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Please type second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num2 + ", " + num1);

        }
        else if (num1 < num2) {
            System.out.println(num1 + ", " + num2);
        } else {
            System.out.println("The numbers are equal!");
        }
    }

}

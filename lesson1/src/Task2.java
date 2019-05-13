import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please type first number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Please type second number: ");
        int num2 = sc.nextInt();

        //calc sum of the numbers//
        System.out.println("The sum is: " + (num1 + num2));

        //calc subs of the numbers//
        System.out.println("The subs is: " + (num1 - num2));

        //calc product of the numbers//
        System.out.println("The product is: " + (num1 * num2));

        //calc division of the numbers//
        System.out.println("The result of the division is: " + (num1 / num2));

        //calc modulo of the numbers//
        System.out.println("The result of the modulo is: " + (num1 % num2));
    }
}

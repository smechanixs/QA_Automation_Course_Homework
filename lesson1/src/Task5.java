import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        int num1 = sc.nextInt();

        System.out.println("Please, enter a second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please, enter a third number: ");
        int num3 = sc.nextInt();
        /*
        num1 = 2
        num2 = 1
        num3 = 3
         */
        if (num1 > num2 && num2 > num3 && num1 > num3) {
            System.out.println(num1 + ", " + num2 + ", " + num3);
        } else if (num1 > num2 && num2 < num3 && num1 > num3) {
            System.out.println(num1 + ", " + num3 + ", " + num2);
        } else if (num1 < num2 && num2 > num3 && num1 > num3) {
            System.out.println(num2 + ", " + num1 + ", " + num3);
        } else if (num1 < num2 && num2 > num3 && num1 < num3) {
            System.out.println(num2 + ", " + num3 + ", " + num1);
        } else if (num1 < num2 && num2 < num3 && num1 < num3) {
            System.out.println(num3 + ", " + num2 + ", " + num1);
        } else if (num1 > num2 && num2 < num3 && num1 < num3) {
            System.out.println(num3 + ", " + num1 + ", " + num2);
        } else {
            System.out.println("Some of the numbers are equal!");
        }
    }
}
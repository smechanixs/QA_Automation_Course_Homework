import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        double num1 = sc.nextDouble();

        System.out.println("Please, enter a second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Please, enter a third number: ");
        double num3 = sc.nextDouble();


        if (((num3 < num2) && (num3 > num1)) || ((num3 > num2) && (num3 < num1))) {
            System.out.println("The number " + num3 + " is between " + num1 + " and " + num2);
        } else if ((num3 == num1) || (num3 == num2)) {
            System.out.println("The number " + num3 + " is either equal to " + num1 + " or " + num2);
        } else {
            System.out.println("The number " + num3 + " is not between " + num1 + " and " + num2);
        }
    }
}

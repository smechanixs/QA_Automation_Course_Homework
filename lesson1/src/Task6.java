import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        int a1 = sc.nextInt();

        System.out.println("Please, enter a second number: ");
        int a2 = sc.nextInt();

        System.out.println("Please, enter a third number: ");
        int a3 = sc.nextInt();
        int temp;
        temp = a1;
        a1 = a2;
        a2 = a3;
        a3 = temp;
        if (a1 == a2 || a2 == a3 || a1 == a3) {
            System.out.println("Some of the numbers you entered are equal!");
        } else {
            System.out.println("a1 = " + a1 + ", " + "a2 = " + a2 + ", " + "a3 = " + a3);
        }
    }
}

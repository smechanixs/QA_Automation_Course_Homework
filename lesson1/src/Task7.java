import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter an hour: ");
        int hour = sc.nextInt();

        System.out.println("Please, enter money amount: ");
        float money = sc.nextFloat();

        System.out.println("Please, answer if you are healthy or not: ");
        boolean healthy = sc.nextBoolean();

        if (!healthy) {
            System.out.println("I am ill and I won't go out :(");

            if (money > 0) {
                System.out.println("I have money and I will buy meds.");
            } else {
                System.out.println("I don't have money so I will stay at home and drink tea.");
            }
        } else {
            if (money < 10) {
                System.out.println("I have less than 10 lv so I will go to coffee bar.");
            }
        }

    }
}
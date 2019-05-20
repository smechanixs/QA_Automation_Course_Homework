import java.util.Scanner;

public class Figure1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number for height and width: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = 1; j < num; j++) {
                System.out.print("# ");
            }
            System.out.println("#");
        }
    }
}
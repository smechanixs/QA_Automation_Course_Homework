import java.util.Scanner;

public class Figure2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number greater than 2 for height and width: ");
        int num = sc.nextInt();

        while (num <= 2){
            System.out.println("Please enter a number greater than 2: ");
            num = sc.nextInt();
        }

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0){
                System.out.print(" ");
            }
            for (int j = 1; j < num; j++) {
                System.out.print("# ");
            }
            System.out.println("#");
        }
    }
}

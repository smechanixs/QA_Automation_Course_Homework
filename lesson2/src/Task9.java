import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        int numA = sc.nextInt();
        System.out.println("Please, enter a second number: ");
        int numB = sc.nextInt();

        int sum = 0;

        for (int i = numA; i <= numB; i++) {
            if (i % 3 == 0) {
                System.out.print("Skip " + i);
                if (i < numB){
                    System.out.print(", ");
                }
            } else {
                sum += i * i;
                if (sum > 200){
                    System.out.print(i * i);
                    break;
                }
                System.out.print(i * i);
                if (i < numB){
                    System.out.print(", ");
                }
            }
        }
    }
}


/*
Да се прочетат 2 числа от клавиатурата А и В. Да се изведат всички
числа от А до В на степен 2(разделени с запетая). Ако някое число е кратно на 3, да
се изведе съобщение че числото се пропуска „skip 3“. Ако сумата от всички
изведени числа (без пропуснатите) стане по-голяма от 200, да се прекрати
извеждането.

 */
public class Task3 {
    public static void main(String[] args) {

        for (int i = -10; i <= 10; i++) {
            if (i % 2 == 1 || i % 2 == -1 ) {

                if (i == 0) {
                    continue;
                }
                if (i == 9){
                    System.out.println(i);
                    break;
                }
                System.out.print(i + ", ");

            }

        }
    }
}
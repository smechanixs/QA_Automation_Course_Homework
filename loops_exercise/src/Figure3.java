public class Figure3 {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                System.out.print("* | ");
            }
            System.out.print(i + " ");
            if (i == 10) {
                System.out.println();
                System.out.println("-------------------------");
            }
        }
        for (int j = 0; j < 9; j++) {
            int step = j + 1;
            for (int k = 1; k <= 9; k++) {
                if (k == 1) {
                    System.out.print(step + "| ");
                    System.out.print(k * step + " ");
                } else {
                    System.out.print(k * step + " ");
                }
            }
            System.out.println("");
        }
    }
}

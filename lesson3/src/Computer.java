public class Computer {
    int year;
    float price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

    void changeOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
    }

    void useMemory(double memory) {
        if (memory > freeMemory) {
            System.out.println("Not enough memory!");
        } else {
            freeMemory -= memory;
        }
    }

    void printYear(int prodYear) {
        System.out.println("The year of production is: " + prodYear);
    }

    void printPrice(float pcPrice) {
        System.out.println("The price is: " + pcPrice);
    }

    void printType(boolean isLaptop) {

        if (isLaptop) {
            System.out.println("The type of the computer is notebook");
        } else {
            System.out.println("The type of the computer is PC");
        }
    }

    void printHddMemory(double hddMemory) {
        System.out.println("The HDD memory is " + hddMemory + " gb");
    }

    void printFreeMemory(double freeHddMemory) {
        System.out.println("The free HDD memory is " + freeHddMemory + " gb");
    }

    void printOperationSystem(String currentOS) {
        System.out.println("You are now running " + currentOS);
    }
}

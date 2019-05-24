import java.sql.Struct;

public class Computer {
    int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;


    Computer() {
        operationSystem = "Win XP";
        isNotebook = false;
    }

    Computer(int year, double price, double hardDiskMemory, double freeMemory) {
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }


    Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
        this();
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;

    }

    int comparePrice(Computer otherPc){
        if (this.price > otherPc.price){
            return -1;
        }
        if (this.price < otherPc.price){
            return  1;
        }
        else {
            return 0;
        }
    }
}

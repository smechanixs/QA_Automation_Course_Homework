public class ComputerDemo {
    public static void main(String[] args) {
        Computer pc1 = new Computer();
        Computer pc2 = new Computer();

        //pc1 data


        pc1.year = 2005;
        pc1.price = 1250;
        pc1.hardDiskMemory = 250;
        pc1.freeMemory = 80.53;
        pc1.operationSystem = "Linux Mint";
        pc1.isNotebook = true;


        //pc2 data


        pc2.year = 2019;
        pc2.price = 3000;
        pc2.hardDiskMemory = 2048;
        pc2.freeMemory = 1376.23;
        pc2.operationSystem = "Windows 10 x64 Pro";
        pc2.useMemory(100.00);
        pc1.changeOperationSystem("Kali Linux");

        //print data pc 1

        System.out.println("Computer 1 data:");
        pc1.printYear(pc1.year);
        pc1.printPrice(pc1.price);
        pc1.printHddMemory(pc1.hardDiskMemory);
        pc1.printFreeMemory(pc1.freeMemory);
        pc1.printOperationSystem(pc1.operationSystem);
        pc1.printType(true);


        System.out.println("------------------------------");
        //print data pc 2

        System.out.println("Computer 2 data:");
        pc2.printYear(pc2.year);
        pc2.printPrice(pc2.price);
        pc2.printHddMemory(pc2.hardDiskMemory);
        pc2.printFreeMemory(pc2.freeMemory);
        pc2.printOperationSystem(pc2.operationSystem);
        pc2.printType(false);
    }
}

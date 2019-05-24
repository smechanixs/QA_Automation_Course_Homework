public class ComputerDemo {
    public static void main(String[] args) {
        Computer pc1 = new Computer(2010, 2400.90, false, 2000.56, 345.80, "Linux Mint");
        Computer pc2 = new Computer(2019, 2400.90, 4200.30, 1352.10);

        int result = pc1.comparePrice(pc2);
        if (result < 0){
            System.out.println("PC 1 is more expensive than PC 2.");
        }
        if (result > 0){
            System.out.println("PC 2 is more expensive than PC 1.");
        }
        else {
            System.out.println("The price of PC 1 is equal to the price of PC 2.");
        }
    }

}

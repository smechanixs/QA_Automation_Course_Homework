public class College {
    public static void main(String[] args) {

        Student Mitko = new Student("Dimitar", "biology", 5.40, 2, 21, false, 0.00);
        Student Pesho = new Student("Peter", "mathematics", 4.30, 1 , 22, true, 90.30);
        Student Gosho = new Student("Georgi", "literature", 5.60, 4, 23, true, 380.50);

        Mitko.receiveScholarship(5.00, 130.34);
        Pesho.upYear();

        StudentGroup Biology = new StudentGroup("biology");
        StudentGroup Maths = new StudentGroup("mathematics");

        System.out.println(Maths.freePlaces);

        Biology.addStudent(Mitko);
        Biology.addStudent(Pesho);
        Biology.addStudent(Gosho);

        Maths.addStudent(Mitko);
        Maths.addStudent(Pesho);
        Maths.addStudent(Gosho);



//        Biology.emptyGroup();
    }
}

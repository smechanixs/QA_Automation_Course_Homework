public class College {
    public static void main(String[] args) {

        Student Mitko = new Student("Dimitar", "biology", 5.40, 2, 21, false, 0.00);
        Student Pesho = new Student("Peter", "mathematics", 4.30, 1, 22, false, 90.30);
        Student Gosho = new Student("Georgi", "literature", 5.60, 4, 23, true, 380.50);
        Student Tosho = new Student("Todor", "mathematics", 3.45, 2, 21, false, 100.00);
        Student Yavor = new Student("Yavor", "mathematics", 3.45, 2, 21, false, 100.00);
        Student Kiro = new Student("Kiril", "mathematics", 3.45, 2, 21, false, 100.00);
        Student Kriso = new Student("Kristian", "mathematics", 3.45, 2, 21, false, 100.00);
        Student Stoyan = new Student("Stoyan", "mathematics", 3.45, 2, 21, false, 100.00);


        Mitko.receiveScholarship(5.00, 130.34);
        Pesho.upYear();

        StudentGroup Bio= new StudentGroup("biology");
        StudentGroup Maths = new StudentGroup("mathematics");
        StudentGroup Lit = new StudentGroup("literature");


        Lit.addStudent(Gosho);
        Bio.addStudent(Mitko);
        Maths.addStudent(Pesho);
        Maths.addStudent(Tosho);
        Maths.addStudent(Yavor);
        Maths.addStudent(Kiro);
        Maths.addStudent(Kriso);
        Maths.addStudent(Stoyan);







//        Biology.emptyGroup();
    }
}

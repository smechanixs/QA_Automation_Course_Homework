public class College {
    public static void main(String[] args) {

        Student Mitko = new Student("Dimitar", "Biology", 5.40, 2, 21, false, 0.00);
        Student Pesho = new Student("Peter", "Mathematics", 4.30, 1, 22, false, 90.30);
        Student Gosho = new Student("Georgi", "Literature", 5.60, 4, 23, true, 380.50);
        Student Tosho = new Student("Todor", "Mathematics", 3.45, 2, 21, false, 100.00);
        Student Yavor = new Student("Yavor", "Mathematics", 3.80, 3, 21, false, 40.00);
        Student Kiro = new Student("Kiril", "Mathematics", 5.10, 3, 21, false, 50.00);
        Student Kriso = new Student("Kristian", "Mathematics", 3.45, 2, 21, false, 60.00);
        Student Stoyan = new Student("Stoyan", "Mathematics", 5.45, 2, 21, false, 80.00);


        Mitko.receiveScholarship(5.00, 130.34);
        Pesho.upYear();

        StudentGroup Bio= new StudentGroup("Biology");
        StudentGroup Maths = new StudentGroup("Mathematics");
        StudentGroup Lit = new StudentGroup("Literature");

        Lit.addStudent(Gosho);

        Bio.addStudent(Mitko);

        Maths.addStudent(Pesho);

        Maths.addStudent(Tosho);

        Maths.addStudent(Yavor);

        Maths.addStudent(Kiro);

        Maths.addStudent(Kriso);

        Maths.theBestStudent();

        Maths.printStudentsInGroup();

        Maths.emptyGroup();
    }
}

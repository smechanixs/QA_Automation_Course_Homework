public class Student extends Person {
    double score;

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMan=" + isMan +
                '}';
    }

    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }
    void showStudentInfo(Student s) {
        System.out.println(s.toString());
    }

}

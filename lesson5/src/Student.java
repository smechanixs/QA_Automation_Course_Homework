class Student extends Person {
    private double score;

    private double getScore() {
        return score;
    }


    Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }

    void showStudentInfo(Student s) {
        System.out.println("Name: " + s.getName() + ", Age: " + s.getAge() + ", Man: " + s.isMan() + ", Score: " + s.getScore());
    }

}






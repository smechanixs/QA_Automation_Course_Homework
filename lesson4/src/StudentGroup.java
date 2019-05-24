public class StudentGroup {
    String groupSubject;
    Student[] students;
    int freePlaces;


    StudentGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;
    }

    StudentGroup(String subject) {
        this();
        this.groupSubject = subject;
    }

    void addStudent(Student s) {
        if (s.subject.equals(groupSubject)) {
            if (freePlaces >= 1) {
                for (int i = 0; i <= students.length; i++) {
                    students[i] = s;
                    freePlaces--;
                }

            }
        }
    }

    void emptyGroup() {
        students = new Student[5];
        freePlaces = 5;

    }

}

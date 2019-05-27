import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

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
                for (int i = students.length - freePlaces; i < students.length; i++) {
                    students[i] = s;
                    freePlaces--;
                    System.out.println(this.students.toString());
                    System.out.print(s.name + " has joined the " + groupSubject + " group.");
                    System.out.println(this.freePlaces + " places left.");
                    System.out.println("------------------------------------");
                    break;
                }
            } else {
                System.out.println("There are no more free places in this group!");
            }
        }
    }

    void emptyGroup() {
        students = new Student[5];
        freePlaces = 5;
        System.out.println(this.groupSubject + " is now empty!");
    }

    String theBestStudent() {
        double hg = 0.00;
        String studentName = "";
        for (int counter = 0; counter < this.students.length; counter++){
            if (hg < this.students[counter].grade) {
                hg = this.students[counter].grade;
                studentName = this.students[counter].name;
            }
        }
        System.out.println("The student with hg is: " + studentName);
        return studentName;
    }
}
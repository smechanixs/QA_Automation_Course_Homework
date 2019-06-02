public class Student {
    String name;
    String subject;
    double grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    double money;


    Student() {
        this.grade = 4.0;
        this.yearInCollege = 1;
        this.isDegree = false;
        this.money = 0;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", grade=" + grade +
                ", yearInCollege=" + yearInCollege +
                ", age=" + age +
                ", isDegree=" + isDegree +
                ", money=" + money +
                '}';
    }

    Student(String name, String subject, double grade, int yearInCollege, int age, boolean isDegree, double money) {
        this();
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.yearInCollege = yearInCollege;
        this.age = age;
        this.isDegree = isDegree;
        this.money = money;
    }

    void upYear() {
        if (!isDegree) {
            this.yearInCollege++;
            if (this.yearInCollege >= 4) {
                isDegree = true;
                System.out.println("The student has already graduated!");

            } else {
                System.out.println(this.name + " is in " + this.yearInCollege + " year in college.");
            }
        } else {
            System.out.println("The student has already graduated!");

        }

    }

    double receiveScholarship(double min, double amount) {
        if (grade >= min && age < 30) {
            this.money += amount;

        }
        return money;
    }


}

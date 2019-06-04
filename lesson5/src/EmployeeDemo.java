import com.sun.xml.internal.ws.spi.db.PropertyGetterBase;

public class EmployeeDemo {
    public static void main(String[] args) {

        Person[] people = new Person[10];

        Person ivan = new Person("Vanko", 45, true);
        Person toshko = new Person("Tosho", 65, true);
        Student megi = new Student("Megi", 19, false, 4.20);
        Student katya = new Student("Katya", 28, false, 5.60);
        Employee gosho = new Employee("Georgi", 19, true, 94.35);
        Employee pesho = new Employee("Peter", 25, true, 120.00);

        people[0] = ivan;
        people[1] = toshko;
        people[2] = megi;
        people[3] = katya;
        people[4] = gosho;
        people[5] = pesho;


        for (int i = 0; i < people.length - 4; i++) {

            if (people[i] instanceof Student) {
                Student s = (Student) people[i];
                s.showStudentInfo(s);

            } else if (people[i] instanceof Employee) {
                Employee e = (Employee) people[i];
                e.showEmployeeInfo(e);
            } else {
                people[i].showPersonInfo(people[i]);

            }
        }

    }
}
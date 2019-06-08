public class EmployeeDemo {
    private static final int ARRAY_LENGHT = 10;

    public static void main(String[] args) {

        Person[] people = new Person[ARRAY_LENGHT];

        Person ivan = new Person("Vanko", 45, true);
        Person toshko = new Person("Tosho", 65, true);
        Student megi = new Student("Megi", 19, false, 4.20);
        Student katya = new Student("Katya", 28, false, 5.60);
        Employee gosho = new Employee("Georgi", 19, true, 94);
        Employee pesho = new Employee("Peter", 25, true, 120);

        people[0] = ivan;
        people[1] = toshko;
        people[2] = megi;
        people[3] = katya;
        people[4] = gosho;
        people[5] = pesho;


        for (int i = 0; i < ARRAY_LENGHT; i++) {
            if (people[i] != null) {
                System.out.println("==================");
                if (people[i] instanceof Student) {
                    Student s = (Student) people[i];
                    s.showStudentInfo(s);

                }
                else if (people[i] instanceof Employee){
                    Employee e = (Employee) people[i];
                    e.showEmployeeInfo(e);

                } else {
                    people[i].showPersonInfo(people[i]);

                }
            }
            if (people[i] != null && people[i] instanceof Employee){
                Employee e = (Employee) people[i];
                System.out.println("The overtime salary of " + e.getName() + " is " + e.calculateOvertime(2));
            }
        }

    }
}
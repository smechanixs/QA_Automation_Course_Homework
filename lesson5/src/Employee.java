public class Employee extends Person {
    double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    double calculateOvertime(double hours) {

        double overtime;
        if (Employee.this.age < 18) {
            overtime = 0;
        } else {

            overtime = (daySalary / 8) * 1.5 * hours;
        }
        double totalSalary = daySalary + overtime;
        return totalSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "daySalary=" + daySalary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMan=" + isMan +
                '}';
    }

    void showEmployeeInfo(Employee e) {
        System.out.println(e.toString());
    }
}

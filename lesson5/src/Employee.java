class Employee extends Person {
    private double daySalary;

    private double getDaySalary() {
        return daySalary;
    }

    Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    double calculateOvertime(double otHours) {
        double overtimeSalary;
        if (Employee.this.getAge() < 18) {
            overtimeSalary = 0;
        } else {
//            Assuming that the normal work day is 8 hours long
            overtimeSalary = (daySalary / 8) * 1.5 * otHours;
        }
        return overtimeSalary;
    }
    void showEmployeeInfo(Employee e) {
        System.out.println("Name: " + e.getName() + ", Age: " + e.getAge() + ", Man: " + e.isMan() + ", Salary: " + e.getDaySalary());
    }
}

class Person {
    private String name;
    private int age;
    private boolean isMan;

    Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }


    boolean isMan() {
        return isMan;
    }


    void showPersonInfo(Person p) {
        System.out.println("Name: " + p.getName() + ", Age: " + p.getAge() + ", Man: " + p.isMan());
    }

}

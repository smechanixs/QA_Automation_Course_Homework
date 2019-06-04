public class Person {
    String name;
    int age;
    boolean isMan;
    Person(){

    }

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMan=" + isMan +
                '}';
    }

    void showPersonInfo(Person p) {
        System.out.println(p.toString());
    }
}

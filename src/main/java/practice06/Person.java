package practice06;

public class Person {
    private String name;
    private int age;

    public Person(String tom, int i) {
        this.name = tom;
        this.age = i;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String introduce() {
        return "My name is " + this.name + ". I am " + String.valueOf(this.age) + " years old.";
    }
}
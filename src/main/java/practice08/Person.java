package practice08;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int i, String tom, int i1) {
        this.id=i;
        this.name=tom;
        this.age=i1;
    }

    public String introduce() {
        return "My name is " + this.name + ". I am " + String.valueOf(this.age) + " years old.";
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Person) obj).getId();
    }
}

package practice08;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int i, String tom, int i1) {
        id=i;
        name=tom;
        age=i1;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + String.valueOf(age) + " years old.";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Person) obj).id;
    }
}

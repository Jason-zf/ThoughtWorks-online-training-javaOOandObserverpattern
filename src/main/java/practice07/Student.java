package practice07;

public class Student extends Person {
    private Klass klass;

    public Student(String tom, int i, Klass klass) {
        super(tom, i);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Student. I am at " + this.klass.getDisplayName() + ".";
    }
}

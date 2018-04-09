package practice08;

public class Student extends Person {
    private Klass klass;

    public Student(int i, String jerry, int i1, Klass klass) {
        super(i, jerry, i1);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Student. I am " + (klass.getLeader() == this ? "Leader of " : "at ") + this.klass.getDisplayName() + ".";
    }
}

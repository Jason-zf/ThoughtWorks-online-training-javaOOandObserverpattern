package practice06;

public class Teacher extends Person {
    private int klass;

    public Teacher(String tom, int i, int i1) {
        super(tom, i);
        this.klass = i1;
    }

    public Teacher(String tom, int i) {
        super(tom, i);
        this.klass = 0;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + (this.klass == 0 ? "No Class." : "Class " + String.valueOf(this.klass) + ".");
    }

    public int getKlass() {
        return this.klass;
    }
}

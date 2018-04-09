package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String tom, int i, Klass klass) {
        super(tom, i);
        this.klass = klass;
    }

    public Teacher(String tom, int i) {
        super(tom, i);
        this.klass = null;
    }

    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + (this.klass == null ? "No Class" : this.klass.getDisplayName()) + ".";
    }

    public String introduceWith(Student jerry) {
        return super.introduce() + " I am a Teacher. I " + (this.klass.getNumber() == jerry.getKlass().getNumber() ? "teach " : "don't teach ") + jerry.getName() + ".";
    }
}

package practice09;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int i, String tom, int i1, Klass klass) {
        super(i, tom, i1);
        this.klass = klass;
    }

    public Teacher(int i, String tom, int i1) {
        super(i, tom, i1);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + (this.klass == null ? "No Class" : this.klass.getDisplayName()) + ".";
    }

    public String introduceWith(Student jerry) {
        return super.introduce() + " I am a Teacher. I " + (this.klass.getNumber() == jerry.getKlass().getNumber() ? "teach " : "don't teach ") + jerry.getName() + ".";
    }
}

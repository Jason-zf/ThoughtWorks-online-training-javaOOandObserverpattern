package practice04;

public class Student extends Person {
    private int klass;

    public Student(String tom, int i, int i1) {
        super(tom, i);
        this.klass = i1;
    }

    public int getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        return super.introduce()+" I am a Student. I am at Class " + String.valueOf(this.klass) + ".";
    }
}

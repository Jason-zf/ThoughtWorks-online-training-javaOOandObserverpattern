package practice11;

import java.util.Observable;

public class Klass extends Observable {
    private int number;
    private Student leader;
    private boolean isInthisKlass;

    public Klass(int i) {
        this.number = i;
    }

    public int getNumber() {
        return this.number;
    }

    public String getDisplayName() {
        return "Class " + String.valueOf(this.number);
    }

    public void assignLeader(Student jerry) {
        if (jerry.getKlass().isInthisKlass == true) {
            this.leader = jerry;
        } else {
            System.out.print("It is not one of us.\n");
        }
        setChanged();
        notifyObservers();
    }

    public Student getLeader() {
        return this.leader;
    }

    public void appendMember(Student jerry) {
        jerry.getKlass().isInthisKlass = true;
        setChanged();
        notifyObservers();
    }

    public boolean isIn(Student student) {
        return this==student.getKlass();
    }
}

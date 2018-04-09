package practice09;

import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private boolean isInthisKlass;

    public Klass(int i) {
        number = i;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + String.valueOf(number);
    }

    public void assignLeader(Student jerry) {
        if (jerry.getKlass().isInthisKlass == true) {
            leader = jerry;
            return;
        }
        System.out.print("It is not one of us.\n");
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student jerry) {
        jerry.getKlass().isInthisKlass = true;
    }
}

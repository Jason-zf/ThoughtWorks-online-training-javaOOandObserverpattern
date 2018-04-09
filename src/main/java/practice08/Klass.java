package practice08;

public class Klass {
    private int number;
    private Student leader;

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
        this.leader = jerry;
    }

    public Student getLeader() {
        return this.leader;
    }
}

package practice07;

public class Klass {
    private int number;

    public Klass(int i) {
        this.number = i;
    }

    public int getNumber() {
        return this.number;
    }

    public String getDisplayName() {
        return "Class " + String.valueOf(this.number);
    }
}

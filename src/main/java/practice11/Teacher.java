package practice11;

import java.util.*;
import java.util.stream.Collectors;

public class Teacher extends Person implements Observer {
    private HashSet<Klass> classes;

    public Teacher(int i, String tom, int i1, HashSet<Klass> es) {
        super(i, tom, i1);
        this.classes = es;
        for (Klass klass : es) {
            klass.addObserver(this);
        }
    }

    public Teacher(int i, String tom, int i1) {
        super(i, tom, i1);
    }

    public HashSet<Klass> getClasses() {
        return this.classes;
    }

    @Override
    public String introduce() {
        if (this.classes == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        List<Integer> cl = this.classes.stream().map(klass -> klass.getNumber()).collect(Collectors.toList());
        Collections.sort(cl);
        return super.introduce() + " I am a Teacher. I teach Class " + cl.stream().map(integer -> String.valueOf(integer)).collect(Collectors.joining(", ")) + ".";
    }

    public boolean isTeaching(Student jerry) {
        return this.classes.stream().filter(klass -> klass.isIn(jerry)).collect(Collectors.toSet()).size() != 0;
    }

    public String introduceWith(Student jerry) {
        return super.introduce() + " I am a Teacher. I " + (this.classes.stream().filter(klass -> klass == jerry.getKlass()).count() != 0 ? "teach " : "don't teach ") + jerry.getName() + ".";
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.print("I am " + this.getName() + ". I know Jerry " + (((Klass) o).getLeader() == null ? "has joined " : "become Leader of ") + "Class 2.\n");
    }
}

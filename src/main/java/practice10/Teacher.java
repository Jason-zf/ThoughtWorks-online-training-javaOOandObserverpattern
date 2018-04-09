package practice10;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private HashSet<Klass> classes;

    public Teacher(int i, String tom, int i1, HashSet<Klass> es) {
        super(i, tom, i1);
        this.classes = es;
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
        return this.classes.stream().filter(klass -> jerry.getKlass() == klass).collect(Collectors.toSet()).size() != 0;
    }

    public String introduceWith(Student jerry) {
        return super.introduce() + " I am a Teacher. I " + (this.classes.stream().filter(klass -> klass == jerry.getKlass()).count() != 0 ? "teach " : "don't teach ") + jerry.getName() + ".";
    }
}

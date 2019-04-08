package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> arrStudents = new ArrayList();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student jerry) {
        if (arrStudents.contains(jerry))
            this.leader = jerry;
        else
            System.out.printf("It is not one of us.\n");
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student jerry) {
        if (!arrStudents.contains(jerry))
            arrStudents.add(jerry);
    }
}

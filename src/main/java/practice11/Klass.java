package practice11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private Teacher teacher;
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
        if (teacher != null)
            //teacher.changeLeader();
            System.out.printf(teacher.changeLeader()+jerry.getName()+" become Leader of "+this.getDisplayName()+".\n");
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student jerry) {
        if (!arrStudents.contains(jerry))
        {
            arrStudents.add(jerry);
            jerry.setKlass(this);
        }
        if (teacher != null)
            System.out.printf(teacher.joinStudent()+jerry.getName()+ " has joined "+this.getDisplayName()+".\n");
    }

    public boolean isIn(LinkedList<Klass> classes) {
        for (Klass temp:classes) {
            if (this.equals(temp))
                return true;
        }
        return false;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}

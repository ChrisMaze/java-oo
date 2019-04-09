package practice11;


import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> classes = new LinkedList();
    private String string = super.introduce() + " I am a Teacher. I teach ";

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.classes = linkedList;
        for (Klass temp:classes) {
            temp.setTeacher(this);
        }
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        if (classes.size() == 0)
            string += "No Class.";
        else {
            string += "Class";
            for (int i = 0; i < classes.size(); i++) {
                string += " " + classes.get(i).getNumber();
                if (i == classes.size() - 1)
                    string += ".";
                else
                    string += ",";
            }
        }
        return string;
    }

    public boolean isTeaching(Student jerry) {
        return jerry.getKlass().isIn(classes);
    }

    public String introduceWith(Student jerry) {
        return super.introduce() + " I am a Teacher. I " +
                (this.isTeaching(jerry) ? "" : "don't ") + "teach " + jerry.getName() + ".";
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public String joinStudent() {
        return "I am "+this.getName()+". I know ";
    }

    public String  changeLeader() {
        return "I am "+this.getName()+". I know ";
    }
}

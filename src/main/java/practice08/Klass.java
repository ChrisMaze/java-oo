package practice08;

public class Klass {
    private int number;
    private Student leader;
    public Klass(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class "+number;
    }

    public void assignLeader(Student jerry) {
        this.leader = jerry;
    }

    public Student getLeader() {
        return leader;
    }
}

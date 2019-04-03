package practice07;

public class Teacher extends Person{
    private Klass klass;
    private String choice;
    public Teacher(String name, int age, Klass klass) {
        super(name,age);
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name,age);
    }
    public Klass getKlass(){
        return klass;
    }
    public String introduce(){
            return super.introduce()+" I am a Teacher. I teach "+
                    (klass != null ? klass.getDisplayName():"No Class")+".";
    }

    public String introduceWith(Student jerry) {
            return super.introduce()+ " I am a Teacher. I "+
                    (klass.getNumber() == jerry.getKlass().getNumber() ? "" : "don't " )+"teach "+jerry.getName()+".";
    }
}

package practice10;

public class Teacher extends Person{
    private Klass klass;
    //private String choice;
    public Teacher(int id,String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }
    public Teacher(int id,String name, int age) {
        super(id,name,age);
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

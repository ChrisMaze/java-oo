package practice03;

public class Worker extends Person{
    private String name;
    private int age;
    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String  getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String introduce()
    {
        return "I am a Worker. I have a job.";
    }
}

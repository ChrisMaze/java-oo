package practice09;

public class Person {
    protected String name;
    protected int age;
    protected int id;
    public boolean equals(Object o) {
        if (!(o instanceof Person)) {
            return false;
        }
        Person other = (Person) o;
        return other.id == id;
    }
    public Person(int id, String name, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public Person() {
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }
}

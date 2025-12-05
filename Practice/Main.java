class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Pruthviraj");
        p.setAge(22);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}

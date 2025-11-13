import mypackage.Student;  // ✅ import the package

public class TestMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(101);
        s1.setName("Pruthviraj");
        s1.setCity("Pune");

        System.out.println("ID: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println("City: " + s1.getCity());
    }
}

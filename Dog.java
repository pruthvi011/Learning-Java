public class Dog {
    String name = "Anna";
    void bark(){
        System.out.println(name+" Bark");
    }

    public static void main(String args[]){
        Dog d1 = new Dog();
        d1.bark();
    }
}

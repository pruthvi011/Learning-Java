class Vehicle{
    void run(){
        System.out.println("Hello from Parent Class!");
    }
}


public class Bike extends Vehicle{
    void run(){
        System.out.println("Hello from Child Class!");
    }

    public static void main(String[] args) {
        Vehicle B1 = new Vehicle();
        B1.run();
    }
}

abstract class Bike {
    abstract void run();
}

class Bajaj extends Bike{
    void run(){
        System.out.println("Bike is running...");
    }
    void show(){

    }
}

class abstractDemo{
    public static void main(String[] args) {
        Bike B1 = new Bajaj();
        B1.run();
    }
}
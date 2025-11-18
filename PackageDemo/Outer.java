public class Outer {

    int a = 20;
    void show(){
        System.out.println("Value :"+a);
    }

    class Inner{

        void display(){
            System.out.println("Hello from Inner Class!");
        }
    }
    
    public static void main(String[] args) {
        Outer O1 = new  Outer();

        Outer.Inner I = O1.new Inner();
        I.display();
    }
}

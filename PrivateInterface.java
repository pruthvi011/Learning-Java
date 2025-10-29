interface MyInterface{
    default void show(){
        printDetails();
        System.out.println("Use to shoe messages");
    }
    default void display(){
        printDetails();
        System.out.println("Use to display Data");
    }
    private void printDetails(){
        System.out.println("Use to print Details");
    }
}

class PrInterface implements MyInterface{

}

public class PrivateInterface {
    public static void main(String[] args) {
        PrInterface p1 = new PrInterface();
        p1.display();
        p1.show();
        }
}

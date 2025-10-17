class Parent{
String message = "Happy Diwali";
}

public class SuperDemo extends Parent{

    String message = "Everyone";

    void showMsg(){
        System.out.println(super.message);
        System.out.println(message);
    }
    public static void main(String args[]){
        SuperDemo d1 = new SuperDemo();
        d1.showMsg();
    }
}

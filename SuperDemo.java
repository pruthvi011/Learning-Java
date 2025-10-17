class Parent{
    String message = "Happy Diwali";
    void eat(){
        System.out.println("I am Eating");
    }
}

public class SuperDemo extends Parent{

    String message = "Everyone";

    void showMsg(){
        System.out.println(super.message);// To access variable by Super Keyword
        System.out.println(message);
        super.eat(); //to access Method by Super Keyword
    }
    public static void main(String args[]){
        SuperDemo d1 = new SuperDemo();
        d1.showMsg();
    }
}

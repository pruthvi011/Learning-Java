public class MethodDemo02 {
    static void goOut(){
        System.out.println("This is userdefined Static Method");
    }
    void display(){
        System.out.println("This is non Static Method");
    }
    public static void main(String args[]){
        MethodDemo02 m1 = new MethodDemo02();
        m1.display();

        goOut();
    }
}

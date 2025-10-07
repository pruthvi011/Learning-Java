public class ConstructorDemo01 {
    public ConstructorDemo01(){
        System.out.println("Default Constructor Executed");
    }
    public static void main(String args[]){
        ConstructorDemo01 d1 = new ConstructorDemo01();
        ConstructorDemo01 d2 = new ConstructorDemo01();
        ConstructorDemo01 d3 = new ConstructorDemo01();
    }
}

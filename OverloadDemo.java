public class OverloadDemo {
    void show(){
        System.out.println("Welcome to overloading!");
    }
    void show(String name){
        System.out.println(name+" Welcome to overloading!");
    }
    void show(String name, String city){
        System.out.println(name+" Welcome to overloading from! "+city);
    }
    public static void main(String[] args) {
        OverloadDemo d1 = new OverloadDemo();
        d1.show();
        d1.show("More");
        d1.show("More", "Pune");
    }
}

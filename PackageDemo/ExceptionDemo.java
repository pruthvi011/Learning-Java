public class ExceptionDemo {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        System.out.println("Welcome to Exception handling..");

        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("Rest of my Code..");
    }
}

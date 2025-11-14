public class MultiExceptionHandling {
    public static void main(String[] args) {
        int[] a = new int[5];
         

        System.out.println("Welcome to Exception handling..");

        try{
            System.out.println(a[6]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Rest of my Code..");
    }
}

import java.io.Console;

public class ConsolePassRead {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.print("Enter Your Name: ");
        String name = c.readLine();

        System.out.print("Enter Your Password: ");
        char[] ch = c.readPassword();
        String pass = String.valueOf(ch);

        System.out.println("Welcome "+name);
        System.out.println("Your Password: "+pass);
    }
}

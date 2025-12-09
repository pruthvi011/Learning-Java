import java.io.Console;

public class ConsoleRead {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.print("Enter Your Name: ");
        String name = c.readLine();
        System.out.println("Welcome "+name);
    }
}

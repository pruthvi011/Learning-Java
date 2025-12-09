// import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) {
        // File myObj = new File("Output.txt");
        try {
            Writer w = new FileWriter("Output.txt");
            String content = "I like to Live in Mumbai";
            w.write(content);
            w.append("\nI like Vadapav");
            w.close();
            System.out.println("Write Successful");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

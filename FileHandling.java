import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try {
      File f1 = new File("C:\\JavaPrograms\\FilesData\\sample.txt"); // Create File object
      if (f1.createNewFile()) {           // Try to create the file
        System.out.println("File created: " + f1.getName());
      } else {
        System.out.println(f1.getName()+ "File already exists.");
      }

      System.out.println("File is Readable: "+f1.canRead());
      System.out.println("File is Writable: "+f1.canWrite());
      System.out.println("File is Executable: "+f1.canExecute());
      
      f1.setReadable(false);
      f1.setWritable(false);
      f1.setExecutable(true);

      System.out.println("\n");

      System.out.println("File is Readable: "+f1.canRead());
      System.out.println("File is Writable: "+f1.canWrite());
      System.out.println("File is Executable: "+f1.canExecute());

    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace(); 
    }
    }
}

import java.io.File;       // Import the File class
import java.io.IOException; // Import IOException to handle errors

public class CreateFile {
  public static void main(String[] args) {
    try {
      File f1 = new File("C:\\JavaPrograms\\FilesData\\sample.txt"); // Create File object
      if (f1.createNewFile()) {           // Try to create the file
        System.out.println("File created: " + f1.getName());
      } else {
        System.out.println(f1.getName()+ "File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace(); 
    }
  }
}
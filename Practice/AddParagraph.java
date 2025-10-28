import java.util.Scanner;
public class AddParagraph {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter 1st Paragraph: ");
        String paragraphOne = SC.nextLine();
        System.out.print("Enter 2nd Paragraph: ");
        String paragraphTwo = SC.nextLine();

        System.out.println("After Addition New Paragraph is: "+ paragraphOne +" "+ paragraphTwo);
        SC.close();
    }
}

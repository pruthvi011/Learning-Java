import java.util.Scanner;
public class SwitchCaseDemo {
    public static void main(String args[]){
        Scanner SC = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1.Cricket");
        System.out.println("2.Football");
        System.out.println("3.Kabaddi");
        System.out.println("4.Hocky");
        System.out.println("5.Kho-Kho");

        System.out.print("Enter Your Choice: ");
        int Choice = SC.nextInt();

        switch(Choice){
            case 1: System.out.println("Okay, Your Favourite Sport is: Cricket");
            break;
            case 2: System.out.println("Okay, Your Favourite Sport is: Football");
            break;
            case 3: System.out.println("Okay, Your Favourite Sport is: Kabaddi");
            break;
            case 4: System.out.println("Okay, Your Favourite Sport is: Hocky");
            break;
            case 5: System.out.println("Okay, Your Favourite Sport is: Kho-Kho");
            break;
            default : System.out.println("Invalid Choice!");
        }

        SC.close();
    }
}

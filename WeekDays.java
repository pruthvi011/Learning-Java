import java.util.Scanner;

public class WeekDays {
    public static void main(String args[]){

        Scanner SC = new Scanner(System.in);

        System.out.println("Menu: ");
        System.out.println("1.Sunday");
        System.out.println("2.Monday");
        System.out.println("3.Tuesday");
        System.out.println("4.Wednesday");
        System.out.println("5.Thursday");
        System.out.println("6.Friday");
        System.out.println("7.Staurday");

        System.out.print("Enter Your Choice: ");
        int Choice = SC.nextInt();

        switch(Choice){
            case 1 : System.out.println("Today is Sunday");
            break;
            case 2 : System.out.println("Today is Monday");
            break;
            case 3 : System.out.println("Today is Tuesday");
            break;
            case 4 : System.out.println("Today is Wednesday");
            break;
            case 5 : System.out.println("Today is Thursday");
            break;
            case 6 : System.out.println("Today is Friday");
            break;
            case 7 : System.out.println("Today is Saturday");
            break;
        }
        SC.close();
    }
}

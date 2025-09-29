import java.util.Scanner;

public class Grades {
    public static void main(String args[]){
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Your Percentage: ");
        int Percentage = SC.nextInt();  

        if(Percentage >= 65 && Percentage <75){
            System.out.println("Your have C grade.");
        }
        else if(Percentage >= 75 && Percentage <95){
            System.out.println("Your have B grade.");
        }
        else if(Percentage >= 95){
            System.out.println("Your have A grade.");
        }
        else{
            System.out.println("You'r Fail!");
        }
        SC.close();
    }
}

import java.util.Scanner;

public class TrafficSingals {
    public static void main(String args[]){
        Scanner SC = new Scanner(System.in);
        System.out.print("What's the Signal Now: ");
        String Signal = SC.next();

        if(Signal.equalsIgnoreCase("Red")){
            System.out.println("Please Stop!");
        }
        else if(Signal.equalsIgnoreCase("Yellow")){
            System.out.println("Please Slow Down!");
        }
        else if(Signal.equalsIgnoreCase("Green")){
            System.out.println("You May Go Now!");
        }

        SC.close();
    }
}

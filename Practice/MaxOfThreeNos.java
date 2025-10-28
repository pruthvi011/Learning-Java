import java.util.Scanner;
public class MaxOfThreeNos {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter 1st, 2nd & 3rd Number: ");
        int a = SC.nextInt();
        int b = SC.nextInt();
        int c = SC.nextInt();

        int max = (a>b)?((a>c)?a:c) : ((b>c)?b:c);
        System.out.println(max+" is Largest");

        SC.close();
    }
}

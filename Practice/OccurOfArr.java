import java.util.Scanner;

public class OccurOfArr {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int [] numArray = ArrayUtility.inputArray();

        System.out.print("Enter a Num You want to find: ");
        int num = SC.nextInt();

        int count = 0;
        for(int i=0;i<numArray.length;i++){
            if (num == numArray[i]) {
                count++;
            }
        }
        System.out.println("Occurrence of "+num+": "+count);

        SC.close();
    }
}
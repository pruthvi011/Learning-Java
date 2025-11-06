import java.util.Scanner;
public class ReverseArr {
    
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int[] numArray = ArrayUtility.inputArray();
        System.out.println("Original Array : ");
        for(int i=0;i<numArray.length;i++){
            System.out.println(numArray[i]);
        }

        System.out.println("Reversed Array: ");
        for(int i=numArray.length-1;i>=0;i--){
            System.out.println(numArray[i]);
        }
        SC.close();
    }
}

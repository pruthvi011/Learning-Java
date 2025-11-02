import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){

        Scanner SC = new Scanner(System.in);
        System.out.print("Enter The Size of Array: ");
        int size = SC.nextInt();
        int [] nums = new int [size];

        System.out.println("Enter the Array Elements: ");
        for(int i=0;i<size;i++){
            nums[i] = SC.nextInt();
        }
        return nums;
    }

    public static long arraySum(int[] numArray){
        int sum = 0;
        for(int i=0;i<numArray.length;i++){
           sum += numArray[i];
        }
        return sum;
    }

    public static double arrayAvg(int[] numArray){
        long sum = arraySum(numArray);
        double avg = sum / numArray.length;
        return avg;
    }
    
}
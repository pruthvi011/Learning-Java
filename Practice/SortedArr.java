public class SortedArr {
    
    public static boolean isIncreasing(int[] numArray){
        for(int i=1;i<numArray.length;i++){
            if(numArray[i-1] >= numArray[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] numArray){
        for(int i=1;i<numArray.length;i++){
            if(numArray[i-1] <= numArray[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();

        boolean isDec =  isDecreasing(numArray);
        boolean isInc =  isIncreasing(numArray);

        if(isInc){
            System.out.println("Your Array is Sorted in Increasing Order");
        }
        else if(isDec){
            System.out.println("Your Array is Sorted in Decreasing Order");
        }
        else{
            System.out.println("Your Array is not Sorted");
        }
    }
}

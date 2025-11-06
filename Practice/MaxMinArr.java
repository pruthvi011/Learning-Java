public class MaxMinArr {
    
    public static void main(String[] args) {
        
        int [] numArray = ArrayUtility.inputArray();

        int maximum=Max(numArray);
        int minimum=Min(numArray);

        System.out.println("Max  element Of array: "+maximum);
        System.out.println("Min  element Of array: "+minimum);

    }
    public static int Max(int[] numArray){

        int max = numArray[0];
        for(int i=0;i<numArray.length;i++){
            if(max < numArray[i]){
                max = numArray[i];
            }
        }
        return max;
    }
    public static int Min(int[] numArray){

        int min = numArray[0];
        for(int i=0;i<numArray.length;i++){
            if(min > numArray[i]){
                min = numArray[i];
            }
        }
        return min;
    }
}


class SumAvgOfArray {

    
    public static void main(String[] args) {
        
        int[] numArray = ArrayUtility.inputArray();

        long sumOfArr = ArrayUtility.arraySum(numArray);
        System.out.println("Sum of the Array Elements: "+sumOfArr);

        double avgOfArr = ArrayUtility.arrayAvg(numArray);
        System.out.println("Average of the array elements: "+avgOfArr);

        
    }
}

public class VariableSwap {
    public static void main(String[] args) {
        int a =5;
        int b=10;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("after Swapping a = "+a+", b = "+b);
    }
}

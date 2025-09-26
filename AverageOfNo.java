import java.util.Scanner;

public class AverageOfNo {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }       

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }   

        double avg = (double) sum / n;   

        System.out.println("Average of the given numbers is: " + avg);

        sc.close();
    }
}

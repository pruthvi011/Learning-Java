public class StaticVariableDemo02 {

    // int count = 0;  //non static variable
    static int count = 0;  //Static variable
     StaticVariableDemo02(){
        count++;
        System.out.println(count);
     }
     public static void main(String args[]){
        StaticVariableDemo02 S1 = new StaticVariableDemo02();
        StaticVariableDemo02 S2 = new StaticVariableDemo02();
        StaticVariableDemo02 S3 = new StaticVariableDemo02();
     }
}

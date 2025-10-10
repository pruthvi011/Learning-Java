public class StaticDemo {
    int empId;
    String empName;
    static String companyName = "TCS";

    StaticDemo(int empId, String empName, String companyName){
        this.empId = empId;
        this.empName = empName;
    }
    void show(){
        System.out.println("Emp ID:"+empId+" Emp Name:"+empName+" Company:"+companyName);
    }
    public static void main(String args[]){
        StaticDemo E1 = new StaticDemo(101,"More",companyName);
        StaticDemo E2 = new StaticDemo(102,"Mahesh",companyName);

        E1.show();
        E2.show();

    }
}

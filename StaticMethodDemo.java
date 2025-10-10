public class StaticMethodDemo {
    int empId;
    String empName;
    static String companyName = "TCS";

    StaticMethodDemo(int empId, String empName, String companyName){
        this.empId = empId;
        this.empName = empName;
    }
    static void change(){
        companyName = "Infosys";
    }
    void show(){
        System.out.println("Emp ID:"+empId+" Emp Name:"+empName+" Company:"+companyName);
    }
    public static void main(String args[]){
        StaticMethodDemo E1 = new StaticMethodDemo(101,"More",companyName);
        StaticMethodDemo E2 = new StaticMethodDemo(102,"Mahesh",companyName);

        change();
        E1.show();
        E2.show();

    }
}

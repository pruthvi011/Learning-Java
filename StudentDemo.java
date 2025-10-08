public class StudentDemo {
    int rollNo;
    String name,course;
    float fees;

    StudentDemo(int rollNo, String name, String course){
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }
    StudentDemo(int rollNo, String name, String course, float fees){
        this(rollNo,name,course);       //Reusing Contructor (i.e. Constructor chaining)
        this.fees = fees;
    }
    void display(){
        System.out.println("rollNo:"+rollNo+" Name:"+name+" Course:"+course+" Fees:"+fees);
    }
    public static void main(String args[]){
        StudentDemo S1 = new StudentDemo(01,"More","BCS",18000);
        S1.display();
        StudentDemo S2 = new StudentDemo(04,"PM","BCS",18000);
        S2.display();
    }
}

public class ThisKeyWordDemo01 {
    int id;
    String name;
    double marks;

    public ThisKeyWordDemo01(int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println("Id:"+id+" Name:"+name+" Marks:"+marks);
    }
    public static void main(String args[]){
        ThisKeyWordDemo01 S1 = new ThisKeyWordDemo01(01,"More",98);
        S1.display();
        ThisKeyWordDemo01 S2 = new ThisKeyWordDemo01(02,"Pruthvi",80);
        S2.display();
    }
}

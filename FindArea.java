// To Find Area of Circle & Square by Method Overloading

public class FindArea {
    void Area(double radius){
        double areaOfCircle = 3.14 * (radius * radius);
        System.out.println("Area of Circle: "+areaOfCircle);
    }
    void Area(String ShapeName, double side){
        double areaOfSquare = side * side;
        System.out.println("Area of "+ShapeName+" : "+areaOfSquare);
    }
    public static void main(String[] args) {
        FindArea A1 = new FindArea();
        A1.Area(4);
        A1.Area("Square", 5);
    }
}

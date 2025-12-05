class CircleArea {

    double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        CircleArea obj = new CircleArea();

        double radius = 5.0;
        double result = obj.area(radius);

        System.out.println("Area of circle = " + result);
    }
}

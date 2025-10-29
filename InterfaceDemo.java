interface Drawable{
    void draw();

    static int cube(int x){
        return x*x*x;
    }

    default void display(){
        System.out.println("Default Method");
    }
}

class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drwawing Rectangle");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Drawable d1 = new Rectangle();
        d1.draw();
        System.out.println(Drawable.cube(10));
        d1.display();
    }
}

package ScannerClass;

import java.util.*;

public class ScannerTestDemo {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("ENter Your Name: ");
        // String name = SC.next();
        String name = SC.nextLine();
        System.out.println(name);
    }
}

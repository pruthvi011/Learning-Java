import java.util.*;
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> t1 = new TreeSet<Integer>();
        t1.add(27);
        t1.add(86);
        t1.add(21);
        t1.add(34);
        t1.add(78);
        t1.add(31);
        t1.add(19);

        System.out.println("Tree Set: "+t1);

        t1.pollFirst();
        t1.pollLast();

        System.out.println("Tree Set after Poll Methods: "+t1);


        System.out.println("Descending Tree Set: "+t1.descendingSet());


    }
}

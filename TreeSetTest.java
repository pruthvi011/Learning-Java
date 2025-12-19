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

        t1.pollFirst();//POLL First Method
        t1.pollLast();//POLL Last Method

        System.out.println("Tree Set after Poll Methods: "+t1);


        System.out.println("Descending Tree Set: "+t1.descendingSet());// Descending Set Method

        System.out.println("Head Tree Set: "+t1.headSet(34,true));//Head Set

        System.out.println("Tail Tree Set: "+t1.tailSet(31,true));//Tail Set

        System.out.println("SubSet Tree Set: "+t1.subSet(27,true,34,true));
        //Subset

        System.out.println("Highest of 19: "+t1.higher(19));//Highest of 19

        System.out.println("Lowest of 19: "+t1.lower(27));//Lowest of 27

    }
}

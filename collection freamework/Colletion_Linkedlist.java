import java.lang.*;
import java.util.*;

public class Colletion_Linkedlist {
    public static void main(String Args[]) {
        LinkedList l1 = new LinkedList();
        l1.addFirst("Omkar");
        l1.addLast(11);
        l1.add(2, "bhagawat");
        l1.add(3, "bhagawat");
        l1.add(4, "bhagawat123");
        Iterator T1 = l1.iterator();
        while (T1.hasNext()) {
            System.out.println(T1.next());
        }

        System.out.println(l1.getFirst());

    }

}

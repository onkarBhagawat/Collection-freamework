import java.lang.*;
import java.util.*;

class Collection_ArrayList {
    public static void main(String Args[]) throws Exception {

        System.out.println("ArratList Example");
        ArrayList l1 = new ArrayList(8);
        ArrayList l2 = new ArrayList(3);
        l1.add('O');
        l1.add('N');
        l1.add('K');
        l1.add('A');
        l1.add('R');
        l2.add('c');
        System.out.println(l1.get(0));
        l1.addAll(l2);
        System.out.println(l1.get(5));
        l1.set(3, "omkar");
        System.out.println(l1.get(3));
        l1.remove(3);
        System.out.println(l1.get(3));
        // l1.retainAll(l2);
        System.out.println(l1.get(0));
        System.out.println(l1.size());
        System.out.println(l1.indexOf('c'));
        System.out.println(l1.lastIndexOf('c'));
        // l1.clear();
        System.out.println(l1.lastIndexOf('c'));
        System.out.println("Iterator list");

        Iterator it = l1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }
}

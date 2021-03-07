
import java.lang.*;
import java.util.*;

public class Vector1 {
    public static void main(String args[]) throws Exception {
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add("omkar");
        v.add(60);
        // System.out.println(v);
        Enumeration e = v.elements();
        
        while (e.hasMoreElements()) {
            String s = (String) e.nextElement();
            System.out.println(s.length());
        }

    }

}

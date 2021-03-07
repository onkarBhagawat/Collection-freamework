import java.util.*;
import java.lang.*;

public class Stack1 {

    public static void main(String Args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(140);

        System.out.println(s.pop());
        System.out.println(s.search(40));
        System.out.println(s.peek());

    }

}

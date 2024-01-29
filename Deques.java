
//Interleave two halves of a Queue:-
import java.util.*;

public class Deques {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addFirst(5);
        deque.addFirst(6);
        deque.addFirst(7);
        deque.addFirst(8);
        deque.addFirst(9);
        deque.addFirst(10);

        System.out.println(deque);
    }
}

/*
 * Output:-
 * [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
 */

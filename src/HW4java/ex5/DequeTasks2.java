package HW4java.ex5;

import java.util.Deque;
import java.util.LinkedList;
class DequeTasks2 {
    public static void removeAllOccurrences(Deque<String> deque,
                                            String value) {
        deque.removeIf(element -> element.equals(value));
        System.out.println(deque);
    }
}

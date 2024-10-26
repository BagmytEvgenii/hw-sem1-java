package HW4java.ex4;

import java.util.Deque;
import java.util.LinkedList;
class DequeTasks {
    public static void rotateDeque(Deque<Integer> deque, int n) {
        if (deque.isEmpty()) return;
        int size = deque.size();
        n = n % size;
        if (n < 0) {
            n += size;
        }
        for (int i = 0; i < n; i++) {
            deque.addLast(deque.removeFirst());
        }
        System.out.println(deque);
    }
}

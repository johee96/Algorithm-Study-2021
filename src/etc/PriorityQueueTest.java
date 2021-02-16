package etc;

import java.util.*;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> priority = new PriorityQueue<>(Collections.reverseOrder());
        //{3,7,6,2,4}
        priority.add(3);
        priority.add(7);
        priority.add(6);
        priority.add(2);
        priority.add(4);

        for (int v : priority) {
            System.out.print(v + " "); // 7 4 6 2 3 -> 우선순위 큐는 힙으로 구현되어있음
        }
        while (!priority.isEmpty()) {
            System.out.print(priority.poll() + " "); // 7 6 4 3 2
        }

    }
}

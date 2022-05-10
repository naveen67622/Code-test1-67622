package basics.corejava;

import java.util.ArrayDeque;
import java.util.Queue;

public class que {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(98);
        q.offer(76);
        q.offer(63);
        q.poll();
        System.out.println(q.isEmpty());
    }
    
}

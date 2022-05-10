package basics.corejava;

import java.util.ArrayDeque;

public class Queue{
    public static void main(String[] args) {
        Queue String q = new ArrayDeque<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        q.poll(); // Delete first item

        System.out.println(q.isEmpty());

        q.forEach(System.out::println);
    }

    
}

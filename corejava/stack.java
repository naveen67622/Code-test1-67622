package basics.corejava;

import java.util.Stack;

public class Stack {
    public static void main(String[] args) {
       Stack<Integer> s = new Stack();
       s.push(23);
       s.push(87);
       s.push(788);
       s.pop();

//System.out.println(s.isEmpty());
//System.out.println(s);
s.forEach(System.out::println );
    }
    
}

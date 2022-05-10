package basics.corejava;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashset {
    public static void main(String[] args) {
       LinkedHashSet <Integer> hashset = new LinkedHashSet();
        hashset.add(45);
        hashset.add(24);
        hashset.add(76);
        hashset.add(76);
        System.out.println(hashset);
    }
    
}

package basics.corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class listex {
    public static List<Integer> convertIntoList() {
        int[] arr = {10, 15, 45, 67, 98};

        // ArrayList<Integer[]> list = Arrays.asList(arr);
        List<Integer> list = new ArrayList<>();

        for (int e : arr) {
            list.add(e);
        }
        return list;
    }

public class listset {
    private static char[] e;

    public static void main(String[] args) {
        ArrayList<Integer> List= new ArrayList<>();
        List.add(10);
        List.add(23);
        List.add(34);
        List.add(24);
        List.add(2,45);
        List.remove(2);
        
       // System.out.println(List);
       // System.out.println(List.size());
        //System.out.println(List.get(3));
       // System.out.println(List.contains(10));
       //System.out.println(List.indexOf(23));

       System.out.println("1) Elements :- ");
       for (int i = 0; i < List.size(); i++) {
           System.out.println(List.get(i));
       }
      System.out.println("2) Elements :- ");
      for (int i : List);
      System.out.println(e);



    System.out.println("Lambda :-");
    List.forEach(e ->System.out.println(e));

    System.out.println("Iterator:-");
    Iterator <Integer>it = List.iterator(); 
    
    while (it.hasNext());
    System.out.println(it.next());
}
}
    }
    class c implements Consumer<Integer> {

        @Override
        public void accept(Integer t) {
            System.out.println(t);
            
        }
    
    }


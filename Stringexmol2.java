package basics;

public class Stringexmol2 {
    public static void main(String[] args) {
        
    
    String s = "Ravi, is, coder,";
    //System.out.println(s.length());
    System.out.println(s.charAt(s.length()-1));
    System.out.println(s.replace("Ravi", "Naveem"));
   
  
        String []sarr = s.split(",");
        for(String str : sarr){
            System.out.println(str);
        }
    }
    }
    

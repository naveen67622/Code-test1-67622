package basics;

public class Implementation implements Interface{

    @Override
    public void name() {
        System.out.println("naresh");
        
    }

    @Override
    public void college() {
        System.out.println("Bits pilani");
        
    }

    @Override
    public void location() {
        System.out.println("Chennai");
        
    }
    public static void main(String[] args) {
    
        new Implementation().college();
        new Implementation().name();
        new Implementation().location();
    }
    
}

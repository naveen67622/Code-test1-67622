package basics.corejava;

@FunctionalInterface
public interface inex {
    public void start();
}

class impl implements inex {

    @Override
    public void start() {
        System.out.println("Hello");
        
    }

}

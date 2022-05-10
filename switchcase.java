package basics;

public class switchcase {
    
    public static void main(String[] args) {
        int i = 3;
        //if i = 0 hello, 1 = hello world, 2 = naveen 3 = hello again 
        switch(i){
            case 0:
            System.out.println("Hello");
            break;
            case 1:
            System.out.println("Hello world");
        break;
        case 2 :
        System.out.println("Naveen");
        break;
        default:
        case 3:
        System.out.println("Hello again");
    }
    }
}

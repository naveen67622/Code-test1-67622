package basics.corejava;

import java.util.Scanner;

public class CBSE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your physics marks marks:-");
        float physics = scan.nextInt();
        System.out.println("Enter your chemistry marks:-");
        float chemistry=scan.nextInt();
        System.out.println("Enter your maths marks");
        float maths = scan.nextInt();
        System.out.println("Enter your biology marks");
        float biology= scan.nextInt();
        System.out.println("Enter your steel marks");
        float steel = scan.nextInt();
        
        
        float percentage = ((physics +   chemistry + maths + biology +   steel)/500.0f)*100;
        System.out.println("percentage:-");
        System.out.println(percentage);

    }
    
}

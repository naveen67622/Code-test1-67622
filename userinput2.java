package basics;

import java.util.Scanner;

public class userinput2 {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Your number " + i);
    }
    
}

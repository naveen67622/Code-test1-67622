package basics;

import java.util.Scanner;

public class evenOdd{
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2==0) {
            System.out.println( n +"  is an Even number");
        } else {
            System.out.println(n + "  is an odd number");
        }
    }
}
package base;

import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
        int i,j;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
          
        System.out.println("Multiplication table of" + i +"is");
        for(j = 1; j<=10; j++);
        System.out.println(i +" * "+ j + "=" + (i*j));
    }


}

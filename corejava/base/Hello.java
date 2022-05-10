package base;

import java.util.stream.IntStream;

// import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your nubmer");
        // int nubmer = sc.nextInt();
        // System.out.println("Your number is : " + nubmer);

        // String c;
        // for(c ="a"; c <='Z'; C++)
        // System.out.println(C + " ");

        // int [] numbers = {3,5,7,-9};
        // int sum = 0;
        // for(int number: numbers) {
        //     sum += number;
        // }
        // System.out.println("Sum = "+ sum);


        int [] num = {1,2,3,4,5};
        int toFind =5;
        boolean found = IntStream.of(num).anyMatch(n ->  n == toFind);
        if (found)
        System.out.println(toFind + "    is found");
        else
        System.out.println(toFind + " is not found");
    }
    
}

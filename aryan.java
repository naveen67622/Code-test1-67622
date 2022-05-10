package basics;

import java.util.Scanner;

public class aryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name :-");
        String name = sc.nextLine();

        System.out.println("Enter your age :-");
        int age = sc.nextInt();

    if (age >=18){
        System.out.println(name  + "   YOU ARE adult");

    }else if(age<0){
        System.out.println("Invalid Input!!");
    }  else {
        System.out.println(name + "   YOU ARE MINOR");
}  
}
}
package base.Assignments;

import java.util.Scanner;

public class Primenumbers {
// //Primes 1 to 50 
public static void main(String[] args) {
    int i   = 0;
        int num =0;
        String primrNumbers ="";
 for ( i =1; i <50; i++){

int counter = 0;
for (num = i; num>=1; num--){
if ( i% num == 0)
{
counter = counter + 1;
}
}
if (counter ==2)
{
    primrNumbers  = primrNumbers + i +"";
    
}
}
System.out.println("Prime numbers from 1 to 50 are : ");
System.out.println(primrNumbers);
}
}

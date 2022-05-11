package base.Assignments;

public class factorial {
    
public static void main(String[] args) {
int n = 5;
int result = 1;
for (int i=n;i>0;i--){
result *= i;
}
System.out.println("Factorial of " + n + " is = " + result);
    
}
}

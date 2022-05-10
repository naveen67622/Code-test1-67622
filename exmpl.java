package basics;

public class exmpl {
    public static void main(String[] args) {
//         float [] marks ={1.3f,4.5f,7.3f,9.3f,1.2f};
//         float sum = 0;
//         for (float elements: marks){
//         sum = sum + elements;
//     }
//     System.out.println("The value of sum is "+sum);  
// }  
// }

                float [] marks ={1.3f,4.5f,7.3f,9.3f,1.2f};
                float num = 1.3f;      
                boolean isInArray = false;
                for(float element:marks){
                if(num==element){
                isInArray = true;
                    break;
                    }
                 if(isInArray){
                System.out.println("The value is present in Array");
                  }else{
                 System.out.println("The value is not present in Array");
                }
                 }
         
}  
}

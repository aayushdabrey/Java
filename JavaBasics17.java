import java.util.*;

public class JavaBasics17 {
    public static void main(String args[]){
        System.out.println("Enter a number"); 

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
         
        if(n==2){
            System.out.println("n is a prime number");

        }else{
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0 ){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("n is a prime number");

        }else{
            System.out.println("n is not a prime number");
        }
    }
    }

}

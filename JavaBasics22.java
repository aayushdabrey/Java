import java.util.*;

public class JavaBasics22 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num ; // to hold number
        int fact = 1; // to hold factorial

        System.out.print("Enter any number");
        num = sc.nextInt();

        for(int i=1; i<=num; i++){
            fact *=i;
        }
        System.out.println(" Factorial: " + fact);
    }
    
}

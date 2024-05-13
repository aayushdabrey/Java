import java.util.*;

public class JavaBasics4 {
    public static void main(String args[]){
        //print the largest of three number 
        System.out.println("Enter the value of A" );
        System.out.println("Enter the value of B" );
        System.out.println("Enter the value of C");

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        //System.out.println("Enter the value of A" + A);
       // System.out.println("Enter the value of B" + B);

        if((A>=B) && (A>=C)){
            System.out.println("A is largest");

        } else if (B >= C){
            System.out.println("B is largest ");
        }
        else {
            System.out.println("C is largest ");
        }
        
    }
    
}

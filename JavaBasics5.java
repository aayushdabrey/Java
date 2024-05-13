import java.util.*;

public class JavaBasics5 {
    public static void main(String args[]){
        System.out.println("Enter the number");
        // print if number is odd or even
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("Even");

        }else {
            System.out.println("Odd ");
        }
    }

    
}

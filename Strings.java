import java.util.*;

public class Strings {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();  

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();  
            int sum = digitSum(n);
            System.out.println(sum);
        }
    }

    private static int digitSum(int n) {
        int sum = 0;

        
        for (int i = 1; i <= n; i++) {
            sum += sumOfDigits(i);
        }

        return sum;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;

        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}

  


   
  




    
     
    

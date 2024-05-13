import java.util.Scanner;

public class JavaBasics25{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int num = 5 ; // to hold number
        int fact = 1; // to hold factorial

        System.out.println(binCoeff(5 , 2));
        num = sc.nextInt();

        for(int i=1; i<=num; i++){
            fact *=i;
        }
        System.out.println(" Factorial: " + fact);
        

    }
    public static int binCoeff(int n, int r) {
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n - r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;


    }
    private static int Factorial(int i) {
        return 0;
    }
    

}
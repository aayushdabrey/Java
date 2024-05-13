import java.util.*;


    

public class JavaBasics10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }

            boolean result = YesNo(a, n);
            System.out.println(result ? "YES" : "NO");
        }

        scanner.close();
    }

    private static boolean YesNo(int[] a, int n) {
        

        
        for (int i = 1; i < n - 1; i++) {
            
            //int diff = a[i] - a[i - 1];

            
            if (a[i]>= 2*a[i-1] && a[i+1] >= a[i-1]) {
                
            

            
            a[i] -= 2*a[i-1];
            a[i + 1] -= a[i+1];
        }
    }
         

        
    }
}

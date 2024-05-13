import java.util.Scanner;

public class JavaBasics8 {
    
    public static void main(String args[]){
        System.out.println("Enter a number ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number) {
            case 1 :
             System.out.println("samosa");
                break;
            case 2 : System.out.println("burger");
                 break;
            case 3 : System.out.println("mango shake");
                  break;
            default:
                break;
        }
    }
    
}

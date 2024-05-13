public class JavaBasics24 {
    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public static void main(String args[]){
        int a = 5;
        int b = 6;
        int prod = multiply(a,b);
        System.out.println("a * b = " + prod);
        prod = multiply(34,9);
        System.out.println("a * b = " + prod);
    }
    
}

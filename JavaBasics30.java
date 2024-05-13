public class JavaBasics30 {
    int n;
    // print inverted and rotated half pyramid
    public static void InvHalfPyramid(int n ){
        
        //outter loop
        for(int i = 1; i<=n; i++){
            //inner loop(spaces)
            for(int j=1; j <= n-i; j++ ){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        
            
        System.out.println();

        }

    }
    public static void main(String args[]){
        InvHalfPyramid(12);


    }

    
}

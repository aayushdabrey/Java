public class JavaBasics27 {
    public static void binToDec(int binNum){
        //  Binary To Decimal Converstion
        int MyNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum>0){
            int lastDigit = binNum % 10 ;
            decNum = decNum + (lastDigit * (int)Math.pow(2 , pow));
            pow++;
            binNum = binNum/10;
        }
        
        System.out.println("decimal of " + MyNum+ " = " + decNum);
    }
    public static void main(String args[]){
        binToDec(111);
        
    }
    
}

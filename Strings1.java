import java.util.*;
public class Strings1 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt(); 

            
            String result = findLexicographicallySmallestWord(n);
            System.out.println(result);
        }
    }

    static String findLexicographicallySmallestWord(int Word) {
        for (int i = 1; i <= 26; i++) {
            for (int j = 1; j <= 26; j++) {
                for (int k = 1; k <= 26; k++) {
                    int threeSum = i + j + k;
                    if (threeSum == Word) {
                        char char1 = (char) (i + 96);
                        char char2 = (char) (j + 96);
                        char char3 = (char) (k + 96);
                        return" "+ char1 + char2 + char3;
                        
                        
                    }
                }
            }
        }
        return ""; 
    }
}


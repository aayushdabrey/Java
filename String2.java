import java.util.Scanner;

public class String2 {

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            String s = scanner.nextLine();

            int result = makeBeautifulString(n, s);
            System.out.println(result);
        }

        scanner.close();
    }

    private static int makeBeautifulString(int n, String s) {
        int count = 0;

        for (int j = 0; j < n - 2; j++) {
            if (s.charAt(j) == 'p' && s.charAt(j + 1) == 'i' && s.charAt(j + 2) == 'e') {
                count++;
                j += 2; // Skip the 'pie' substring
            } else if (s.charAt(j) == 'm' && s.charAt(j + 1) == 'a' && s.charAt(j + 2) == 'p') {
                count++;
                j += 2; // Skip the 'map' substring
            }
        }

        return count;
    }
}


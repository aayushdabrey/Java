import java.util.*;




public class JavaBasics12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();

            int[] leftPocket = new int[n];
            int[] rightPocket = new int[m];

            for (int j = 0; j < n; j++) {
                leftPocket[j] = scanner.nextInt();
            }

            for (int j = 0; j < m; j++) {
                rightPocket[j] = scanner.nextInt();
            }

            Arrays.sort(leftPocket);
            Arrays.sort(rightPocket);

            int count = 0;
            int leftIndex = n - 1;
            int rightIndex = 0;

            while (leftIndex >= 0 && rightIndex < m) {
                int sum = leftPocket[leftIndex] + rightPocket[rightIndex];
                if (sum <= k) {
                    count += leftIndex + 1;  // Count all coins from the left pocket up to the current index
                    rightIndex++;
                } else {
                    leftIndex--;
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }
}

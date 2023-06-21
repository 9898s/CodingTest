import java.util.Scanner;

public class Main {
    public static final int SIZE = 1003001;

    public static void main(String[] args) {
        boolean[] check = new boolean[SIZE + 1];
        check[0] = check[1] = true;

        for (int i = 2; i * i <= SIZE; i++) {
            if (check[i]) {
                continue;
            }
            for (int j = i + i; j <= SIZE; j += i) {
                check[j] = true;
            }
        }

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = N; i <= SIZE; i++) {
            if (!check[i] && isPalindrome(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean isPalindrome(int N) {
        StringBuilder sb = new StringBuilder();

        int tmp = N;
        while (tmp != 0) {
            sb.append(tmp % 10);
            tmp /= 10;
        }
        return N == Integer.valueOf(sb.toString());
    }
}
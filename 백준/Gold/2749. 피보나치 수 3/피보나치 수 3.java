import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        int pisano = 1_500_000;
        long[] num = new long[pisano + 1];

        num[0] = 0;
        num[1] = 1;

        for (int i = 2; i <= pisano; i++) {
            num[i] = (num[i - 1] + num[i - 2]) % 1_000_000;
        }
        System.out.println(num[(int) (N % pisano)]);
    }
}

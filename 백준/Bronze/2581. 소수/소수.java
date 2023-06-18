import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int answer = 0;
        int min = Integer.MAX_VALUE;

        for (int i = N; i <= M; i++) {
            if (isPrime(i)) {
                answer += i;
                min = Math.min(min, i);
            }
        }

        if (answer != 0) {
            System.out.println(answer);
            System.out.println(min);
        } else {
            System.out.println("-1");
        }
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
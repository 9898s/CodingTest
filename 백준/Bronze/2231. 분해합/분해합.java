import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 216 = 198 + 1 + 9 + 8

        int N = sc.nextInt();
        int answer = 0;

        for (int i = 1; i <= N; i++) {
            int num = i;
            int tmp = i;

            while (tmp != 0) {
                num += tmp % 10;
                tmp /= 10;
            }

            if (num == N) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
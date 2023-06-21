import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[] check = new boolean[M + 1];
        check[0] = check[1] = true;

        for (int i = 2; i * i <= M; i++) {
            if (check[i]) {
                continue;
            }

            for (int j = i + i; j <= M; j += i) {
                check[j] = true;
            }
        }

        for (int i = N; i < M + 1; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }
}
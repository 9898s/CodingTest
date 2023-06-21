import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        primeNumber(N, K);
    }

    public static void primeNumber(int N, int K) {
        boolean[] check = new boolean[N + 1];
        check[0] = check[1] = true;

        int cnt = 0;
        for (int i = 2; i <= N; i++) {
            if (check[i]) {
                continue;
            }

            for (int j = i; j <= N; j += i) {
                if (!check[j]) {
                    check[j] = true;
                    cnt++;

                    if (cnt == K) {
                        System.out.println(j);
                        return;
                    }
                }
            }
        }
    }
}
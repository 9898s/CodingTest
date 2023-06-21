import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean[] check = new boolean[1001];
        check[0] = check[1] = true;
        for (int i = 2; i * i <= 1000; i++) {
            if (check[i]) {
                continue;
            }
            for (int j = i + i; j <= 1000; j += i) {
                check[j] = true;
            }
        }

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int answer = 0;
        for (int i = 0; i < N; i++) {
            int M = sc.nextInt();
            if (!check[M]) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
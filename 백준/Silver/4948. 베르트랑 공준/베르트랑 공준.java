import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] check = new boolean[123456 * 2 + 1];
        check[0] = check[1] = true;

        for (int i = 2; i * i <= 123456 * 2; i++) {
            if (check[i]) {
                continue;
            }
            for (int j = i + i; j <= 123456 * 2; j += i) {
                check[j] = true;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }

            int answer = 0;
            for (int i = n + 1; i <= n * 2; i++) {
                if (!check[i]) {
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}
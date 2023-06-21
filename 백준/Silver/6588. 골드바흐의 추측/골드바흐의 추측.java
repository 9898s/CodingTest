import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] check = new boolean[1000000 + 1];
        check[0] = check[1] = true;

        for (int i = 2; i * i <= 1000000; i++) {
            if (check[i]) {
                continue;
            }

            for (int j = i + i; j <= 1000000; j += i) {
                check[j] = true;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }

            // N = A + B;
            boolean isFlag = false;
            for (int i = 2; i <= n / 2; i++) {
                if (!check[i] && !check[n - i]) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                    isFlag = true;
                    break;
                }
            }

            if (!isFlag) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}
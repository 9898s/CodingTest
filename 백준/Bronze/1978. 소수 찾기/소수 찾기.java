import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
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

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (!check[Integer.parseInt(st.nextToken())]) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 1;
        int num = 10;
        int answer = 0;

        for (int i = 1; i <= N; i++) {
            if (i % num == 0) {
                num *= 10;
                cnt++;
            }
            answer += cnt;
        }
        System.out.println(answer);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        boolean[] check = new boolean[N + 1];
        check[0] = check[1] = true;

        for (int i = 2; i * i <= N; i++) {
            if (check[i]) {
                continue;
            }
            for (int j = i + i; j <= N; j += i) {
                check[j] = true;
            }
        }

        for (int i = 0; i < check.length; i++) {
            if (!check[i]) {
                list.add(i);
            }
        }

        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            int sum = 0;
            for (int j = i; j < list.size(); j++) {
                sum += list.get(j);
                if (sum == N) {
                    answer++;
                    break;
                } else if (sum > N) {
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
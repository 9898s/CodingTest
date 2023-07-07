import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());

            if (M == 0) {
                sb.append(pq.isEmpty() ? "0" : pq.poll()).append('\n');
                continue;
            }
            pq.add(M);
        }
        System.out.print(sb);
    }
}
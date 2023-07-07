import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int last = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            switch (st.nextToken()) {
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    queue.offer(last);
                    break;
                case "pop":
                    sb.append(queue.isEmpty() ? "-1" : queue.poll()).append('\n');
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? "1" : "0").append('\n');
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? "-1" : queue.peek()).append('\n');
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? "-1" : last).append('\n');
                    break;
            }
        }
        System.out.print(sb);
    }
}
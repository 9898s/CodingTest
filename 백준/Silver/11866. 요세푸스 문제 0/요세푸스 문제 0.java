import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < K - 1; i++) {
            queue.add(queue.poll());
        }
        list.add(queue.peek());

        int cnt = 0;
        while (cnt < N - 1) {
            for (int i = 0; i < K; i++) {
                queue.add(queue.poll());
                if (list.contains(queue.peek())) {
                    i--;
                }
            }
            list.add(queue.peek());
            cnt++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                sb.append(list.get(i) + ", ");
            } else {
                sb.append(list.get(i) + ">");
            }
        }
        System.out.println(sb);
    }
}
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
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (queue.size() > 0) {
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll() + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");

        System.out.println(sb);
    }
}
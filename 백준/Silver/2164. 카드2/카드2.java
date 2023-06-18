import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        boolean isFlag = false;
        while (queue.size() > 1) {
            if (!isFlag) {
                queue.poll();
            } else {
                queue.add(queue.poll());
            }
            isFlag = !isFlag;
        }
        System.out.println(queue.poll());
    }
}
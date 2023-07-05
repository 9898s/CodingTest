import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println(priorityQueue.isEmpty() ? "0" : priorityQueue.poll());
            } else {
                priorityQueue.add(num);
            }
        }
    }
}

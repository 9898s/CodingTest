import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] answer = IntStream.range(1, N + 1).toArray();

        for (int i = 0; i < M; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;

            while (start < end) {
                int tmp = answer[start];
                answer[start++] = answer[end];
                answer[end--] = tmp;
            }
        }

        for (int item : answer) {
            System.out.print(item + " ");
        }
    }
}
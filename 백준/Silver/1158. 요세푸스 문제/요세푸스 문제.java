import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = i + 1;
        }

        int idx = 0;
        int count = K;
        LinkedList<Integer> list = new LinkedList<>();

        while (list.size() != N) {
            if (arr[idx][1] == 0) {
                count--;
            }

            if (count == 0) {
                list.add(arr[idx][0]);
                arr[idx][1] = 1;
                count = K;
            }

            idx++;
            if (idx >= N) {
                idx = 0;
            }
        }

        System.out.print("<");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.printf("%d, ", list.get(i));
        }
        System.out.printf("%d", list.getLast());
        System.out.print(">");
    }
}
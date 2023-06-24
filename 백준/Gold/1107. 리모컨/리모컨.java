import java.util.Scanner;

public class Main {
    public static boolean[] check = new boolean[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int X = sc.nextInt();
            check[X] = true;
        }

        int answer = Math.abs(N - 100);
        for (int i = 0; i < 1000000; i++) {
            if (possible(i) > 0) {
                int num = String.valueOf(i).length() + Math.abs(N - i);
                answer = Math.min(answer, num);
            }
        }
        System.out.println(answer);
    }

    public static int possible(int T) {
        if (T == 0) {
            if (check[0]) {
                return 0;
            } else {
                return 1;
            }
        }

        int len = 0;
        while (T > 0) {
            if (check[T % 10]) {
                return 0;
            }
            T /= 10;
            len++;
        }
        return len;
    }
}
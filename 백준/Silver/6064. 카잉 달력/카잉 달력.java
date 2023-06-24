import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            boolean isFlag = false;

            int M = sc.nextInt();
            int N = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            for (int j = x; j < M * N; j += M) {
                if (j % N == y) {
                    System.out.println(j + 1);
                    isFlag = true;
                    break;
                }
            }
            if (!isFlag) {
                System.out.println(-1);
            }
        }
    }
}
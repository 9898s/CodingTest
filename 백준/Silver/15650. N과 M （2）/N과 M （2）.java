import java.util.Scanner;

public class Main {
    public static int[] a;
    public static boolean[] c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        c = new boolean[N];
        a = new int[M];

        go(0, N, M);
    }

    public static void go(int index, int n, int m) {
        if (index == m) {
            for (int item : a) {
                System.out.print(item + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (c[i]) {
                continue;
            }

            c[i] = true;
            a[index] = i + 1;
            go(index + 1, n, m);

            for (int j = i + 1; j < n; j++) {
                c[j] = false;
            }
        }
    }
}
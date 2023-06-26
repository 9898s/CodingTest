import java.util.Scanner;

public class Main {
    public static int[] a;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        a = new int[M];

        go(0, N, M);
        System.out.print(sb);
    }

    public static void go(int index, int n, int m) {
        if (index == m) {
            for (int item : a) {
                sb.append(item).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            a[index] = i + 1;
            go(index + 1, n, m);
        }
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean[] c;
    public static int[] a;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        c = new boolean[N];
        a = new int[M];

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        go(0, 0, N, M);
        System.out.print(sb);
    }

    public static void go(int index, int start, int N, int M) {
        if (index == M) {
            for (int item : a) {
                sb.append(item).append(" ");
            }
            sb.append("\n");
            return;
        }

        int before = 0;
        for (int i = start; i < N; i++) {
            if (c[i]) {
                continue;
            }

            if (before != arr[i]) {
                c[i] = true;
                a[index] = arr[i];
                before = arr[i];
                go(index + 1, i + 1, N, M);
                c[i] = false;
            }
        }
    }
}
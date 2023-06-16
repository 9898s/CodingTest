import java.util.Scanner;

public class Main {
    public static int cnt = 0;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        hanoiTower(N, 1, 2, 3);

        System.out.println(cnt);
        System.out.println(sb);
    }

    public static void hanoiTower(int n, int from, int tmp, int to) {
        cnt++;
        if (n == 1) {
            sb.append(from + " " + to + '\n');
            return;
        } else {
            hanoiTower(n - 1, from, to, tmp);
            sb.append(from + " " + to + '\n');
            hanoiTower(n - 1, tmp, from, to);
        }
    }
}
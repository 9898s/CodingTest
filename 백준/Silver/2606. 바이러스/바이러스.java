import java.util.Scanner;

public class Main {
    public static int N;
    public static int[][] arr;
    public static boolean[] visited;
    public static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int T = sc.nextInt();

        arr = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a][b] = arr[b][a] = 1;
        }

        System.out.println(dfs(1));
    }

    public static int dfs(int i) {
        visited[i] = true;

        for (int j = 1; j <= N; j++) {
            if (!visited[j] && arr[i][j] == 1) {
                dfs(j);
                cnt++;
            }
        }
        return cnt;
    }
}
import java.util.Scanner;

public class Main {
    private final static boolean[][] WHITE = {
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 세로
        int M = sc.nextInt(); // 가로

        boolean[][] board = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                board[i][j] = str.charAt(j) == 'W';
            }
        }

        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                minValue = Math.min(minValue, checkBoard(i, j, board));
            }
        }
        System.out.println(minValue);
    }

    public static int checkBoard(int n, int m, boolean[][] board) {
        int count = 0;
        for (int i = n; i < n + 8; i++) {
            for (int j = m; j < m + 8; j++) {
                if (board[i][j] != WHITE[i - n][j - m]) {
                    count++;
                }
            }
        }
        return Math.min(count, 64 - count);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = Integer.MIN_VALUE;

        char[][] candy = new char[N][N];
        for (int i = 0; i < N; i++) {
            String str = sc.next();

            for (int j = 0; j < N; j++) {
                candy[i][j] = str.charAt(j);
            }
        }

        // 가로
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j + 1 < N) {
                    char tmp = candy[i][j];
                    candy[i][j] = candy[i][j + 1];
                    candy[i][j + 1] = tmp;

                    answer = Math.max(answer, check(candy));

                    candy[i][j + 1] = candy[i][j];
                    candy[i][j] = tmp;
                }
            }
        }

        // 세로
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j + 1 < N) {
                    char tmp = candy[j][i];
                    candy[j][i] = candy[j + 1][i];
                    candy[j + 1][i] = tmp;

                    answer = Math.max(answer, check(candy));

                    candy[j + 1][i] = candy[j][i];
                    candy[j][i] = tmp;
                }
            }
        }
        System.out.println(answer);
    }

    public static int check(char[][] arr) {
        int answer = Integer.MIN_VALUE;

        // 가로
        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i][j] == arr[i][j - 1]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                answer = Math.max(answer, cnt);
            }
        }

        // 세로
        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j][i] == arr[j - 1][i]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                answer = Math.max(answer, cnt);
            }
        }
        return answer;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        int e = 1;
        int s = 1;
        int m = 1;

        int answer = 1;
        while (true) {
            if (e == E && s == S && m == M) {
                System.out.println(answer);
                break;
            }

            e++;
            s++;
            m++;
            answer++;

            if (e > 15) {
                e = 1;
            }
            if (s > 28) {
                s = 1;
            }
            if (m > 19) {
                m = 1;
            }
        }
    }
}
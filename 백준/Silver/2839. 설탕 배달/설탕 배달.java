import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cnt = 0;
        while (true) {
            if (N % 5 == 0) {
                System.out.println(N / 5 + cnt);
                break;
            }
            if (N < 3) {
                System.out.println("-1");
                break;
            }

            N -= 3;
            cnt++;
        }
    }
}
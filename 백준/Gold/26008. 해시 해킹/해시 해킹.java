import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long M = sc.nextInt();

        int A = sc.nextInt();
        int h = sc.nextInt();

        long answer = 1;
        for (int i = 0; i < N - 1; i++) {
            answer = (answer * M) % 1000000007;
        }
        System.out.println(answer);
    }
}
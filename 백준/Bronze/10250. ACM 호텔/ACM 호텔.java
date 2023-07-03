import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int F = 0;
            int D = 0;

            if (N % H == 0) {
                F = H;
                D = N / H;
            } else {
                F = N % H;
                D = N / H + 1;
            }
            System.out.println(F + String.format("%02d", D));
        }
    }
}
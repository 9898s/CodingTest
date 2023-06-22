import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int num = 1;
        int idx = 0;
        while (true) {
            if (String.valueOf(num).contains("666")) {
                idx++;
            }
            if (idx == N) {
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}

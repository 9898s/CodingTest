import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            int N = sc.nextInt();

            int num = 0;
            int cnt = 0;
            while (true) {
                num = num * 10 + 1;
                num %= N;
                cnt++;

                if (num == 0) {
                    System.out.println(cnt);
                    break;
                }
            }
        }
    }
}
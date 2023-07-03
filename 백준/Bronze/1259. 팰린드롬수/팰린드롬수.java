import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(n);

            String s1 = String.valueOf(n);
            String s2 = sb.reverse().toString();

            System.out.println(s1.equals(s2) ? "yes" : "no");
        }
    }
}
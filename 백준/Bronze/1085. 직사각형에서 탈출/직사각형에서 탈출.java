import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int r = Math.min(Math.abs(w - x), x);
        int c = Math.min(Math.abs(h - y), y);

        System.out.println(Math.min(r, c));
    }
}
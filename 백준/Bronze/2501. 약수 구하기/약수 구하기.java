import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                list.add(i);
            }
        }

        if (M > list.size()) {
            System.out.println("0");
        } else {
            System.out.println(list.get(M - 1));
        }
    }
}

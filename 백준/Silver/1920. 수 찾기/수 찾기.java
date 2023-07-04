import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int num = sc.nextInt();
            System.out.println(hm.containsKey(num) ? "1" : "0");
        }
    }
}

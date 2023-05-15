import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();

            hm.put(a, hm.getOrDefault(a, 0) + 1);
        }

        int v = sc.nextInt();
        System.out.println(hm.containsKey(v) ? hm.get(v) : 0);
    }
}
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        HashMap<String, Integer> hashMap = new HashMap<>();
        HashMap<Integer, String> hashMap2 = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            hashMap.put(name, i + 1);
            hashMap2.put(i + 1, name);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String s = sc.next();
            if (isNumeric(s)) {
                sb.append(hashMap2.get(Integer.parseInt(s))).append('\n');
            } else {
                sb.append(hashMap.get(s)).append('\n');
            }
        }
        System.out.print(sb);
    }

    public static boolean isNumeric(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
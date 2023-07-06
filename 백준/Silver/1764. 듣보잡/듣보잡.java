import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < N + M; i++) {
            String name = sc.next();

            if (i < N) {
                hashMap.put(name, hashMap.getOrDefault(name, 0) + 1);
            } else {
                hashMap.put(name, hashMap.getOrDefault(name, 0) - 1);
            }
        }

        ArrayList<String> list = new ArrayList<>();
        int cnt = 0;
        for (String s : hashMap.keySet()) {
            if (hashMap.get(s) == 0) {
                list.add(s);
                cnt++;
            }
        }

        System.out.println(cnt);
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}

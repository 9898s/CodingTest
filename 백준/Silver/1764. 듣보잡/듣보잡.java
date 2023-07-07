import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < N + M; i++) {
            String name = br.readLine();

            if (i < N) {
                hm.put(name, hm.getOrDefault(name, 0) + 1);
            } else {
                hm.put(name, hm.getOrDefault(name, 0) - 1);
            }
        }

        int cnt = 0;
        ArrayList<String> list = new ArrayList<>();

        for (String s : hm.keySet()) {
            if (hm.get(s) == 0) {
                list.add(s);
                cnt++;
            }
        }
        sb.append(cnt).append('\n');

        Collections.sort(list);
        for (String s : list) {
            sb.append(s).append('\n');
        }

        System.out.print(sb);
    }
}
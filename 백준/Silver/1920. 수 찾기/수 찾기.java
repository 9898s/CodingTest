import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            hm.put(Integer.parseInt(st.nextToken()), 0);
        }

        int M = Integer.parseInt(br.readLine());
        str = br.readLine();
        st = new StringTokenizer(str, " ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            sb.append(hm.containsKey(Integer.parseInt(st.nextToken())) ? "1" : "0").append('\n');
        }
        System.out.print(sb);
    }
}
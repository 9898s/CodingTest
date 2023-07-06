import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if (str.equals("0")) {
                break;
            }

            StringBuilder str2 = new StringBuilder(str);
            sb.append(str.contentEquals(str2.reverse()) ? "yes" : "no").append('\n');
        }
        System.out.print(sb);
    }
}
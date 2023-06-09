import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        long sum = 0;
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            sum += (str.charAt(i) - 'a' + 1) * Math.pow(31, i) % 1234567891;
        }
        System.out.println(sum);
    }
}
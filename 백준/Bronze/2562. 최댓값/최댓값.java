import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[2];
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            if (arr[0] < n) {
                arr[0] = n;
                arr[1] = i + 1;
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
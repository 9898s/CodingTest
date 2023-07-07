import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            sb.append(check(str) ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }

    public static boolean check(String str) {
        Stack<Character> stack = new Stack<>();

        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                
                stack.pop();
            } else {
                stack.push(str.charAt(j));
            }
        }
        return stack.isEmpty();
    }
}
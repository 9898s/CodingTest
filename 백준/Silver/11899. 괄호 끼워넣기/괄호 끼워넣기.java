import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        System.out.println(checkMatching(S));
    }

    public static int checkMatching(String s) {
        int cnt = 0;
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    cnt++;
                } else {
                    char open_ch = stack.pop();
                    if (open_ch == '(' && ch != ')') {
                        cnt++;
                    }
                }
            }
        }
        cnt += stack.size();
        return cnt;
    }
}
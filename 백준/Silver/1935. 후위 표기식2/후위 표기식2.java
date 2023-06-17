import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();

        HashMap<Character, Double> hm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            hm.put((char) ('A' + i), (double) num);
        }

        double op1, op2, value;
        Stack<Double> stack = new Stack<>();

        for (char ch : S.toCharArray()) {
            if (ch != '+' && ch != '-' && ch != '*' && ch != '/') {
                stack.push(hm.get(ch));
            } else {
                op2 = stack.pop();
                op1 = stack.pop();

                if (ch == '+') {
                    stack.push(op1 + op2);
                } else if (ch == '-') {
                    stack.push(op1 - op2);
                } else if (ch == '*') {
                    stack.push(op1 * op2);
                } else if (ch == '/') {
                    stack.push(op1 / op2);
                }
            }
        }
        System.out.println(String.format("%.2f", stack.pop()));
    }
}

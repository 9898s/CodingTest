import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        infixToPostFix(S);
    }

    public static int prec(char op) {
        if (op == '(' || op == ')') {
            return 0;
        } else if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        }
        return -1;
    }

    public static void infixToPostFix(String exp) {
        char topOp;
        Stack<Character> stack = new Stack<>();

        for (char ch : exp.toCharArray()) {
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') { // 연산자
                while (!stack.isEmpty() && (prec(ch) <= prec(stack.peek()))) {
                    System.out.printf("%c", stack.pop());
                }
                stack.push(ch);
            } else if (ch == '(') { // 왼쪽 괄호
                stack.push(ch);
            } else if (ch == ')') { // 오른쪽 괄호
                topOp = stack.pop();

                // 왼쪽 괄호를 만날때까지 출력
                while (topOp != '(') {
                    System.out.printf("%c", topOp);
                    topOp = stack.pop();
                }
            } else { // 피연산자
                System.out.printf("%c", ch);
            }
        }
        while (!stack.isEmpty()) { // 스택에 저장된 연산자들 출력
            System.out.printf("%c", stack.pop());
        }
    }
}
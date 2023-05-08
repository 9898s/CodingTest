import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer>[] stack = new Stack[4];

        for (int i = 0; i < stack.length; i++) {
            stack[i] = new Stack<>();
        }

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            for (int j = 0; j < 4; j++) {
                if(stack[j].empty() || stack[j].peek() < num) {
                    stack[j].push(num);
                    count++;
                    break;
                }
            }
        }

        System.out.println(N != count ? "NO" : "YES");
    }
}
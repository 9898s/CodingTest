import java.util.Scanner;

public class Main {
    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        stack = new int[N];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            switch (sc.next()) {
                case "push":
                    push(sc.nextInt());
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int item) {
        stack[size++] = item;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        }

        int tmp = stack[size - 1];
        stack[size - 1] = 0;
        size--;
        return tmp;
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        return size == 0 ? 1 : 0;
    }

    public static int top() {
        return size == 0 ? -1 : stack[size - 1];
    }
}
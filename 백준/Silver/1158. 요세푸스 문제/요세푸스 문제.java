import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringBuffer sb = new StringBuffer("<");
        
        int idx = 0;
        while (!list.isEmpty()) {
            idx = (idx + (K - 1)) % list.size();
            sb.append(list.remove(idx) + ", ");
        }

        sb.delete(sb.length() - 2, sb.length()).append(">");
        System.out.println(sb);
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int count = 0;
        for (int i = 0; i < M; i++) {
            int num = sc.nextInt();

            while (list.get(0) != num) {
                if (list.indexOf(num) <= list.size() / 2) {
                    int x = list.remove(0);
                    list.add(x);
                } else if (list.indexOf(num) > list.size() / 2) {
                    int y = list.remove(list.size() - 1);
                    list.add(0, y);
                }
                count++;
            }
            list.remove(0);
        }
        System.out.println(count);
    }
}
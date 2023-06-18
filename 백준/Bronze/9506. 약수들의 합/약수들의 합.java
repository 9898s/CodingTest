import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();

            if (N == -1) {
                break;
            }

            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            int sum = 1;

            for (int i = 2; i * i <= N; i++) {
                if (N % i == 0) {
                    list.add(i);
                    list.add(N / i);
                    sum += i + N / i;
                }
            }

            if (N == sum) {
                Collections.sort(list);
                System.out.printf("%d = ", N);

                for (int i = 0; i < list.size(); i++) {
                    if (i < list.size() - 1) {
                        System.out.printf("%d + ", list.get(i));
                    } else {
                        System.out.printf("%d\n", list.get(i));
                    }
                }
            } else {
                System.out.printf("%d is NOT perfect.\n", N);
            }
        }
    }
}
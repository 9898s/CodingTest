import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] strings = new String[N];

        for (int i = 0; i < N; i++) {
            strings[i] = sc.next();
        }

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        System.out.println(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].equals(strings[i - 1])) {
                continue;
            }
            System.out.println(strings[i]);
        }
    }
}
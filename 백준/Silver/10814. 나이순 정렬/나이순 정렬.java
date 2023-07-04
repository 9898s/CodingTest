import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[][] matrix = new String[N][2];
        for (int i = 0; i < N; i++) {
            matrix[i][0] = sc.next();
            matrix[i][1] = sc.next();
        }

        Arrays.sort(matrix, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[1].equals(o2)) {
                    return 0;
                }
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(matrix[i][0] + " " + matrix[i][1]);
        }
    }
}

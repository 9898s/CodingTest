import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int[] person = new int[9];
        for (int i = 0; i < 9; i++) {
            person[i] = sc.nextInt();
            sum += person[i];
        }
        Arrays.sort(person);

        for (int i = 0; i < person.length; i++) {
            for (int j = i + 1; j < person.length; j++) {
                if (sum - person[i] - person[j] == 100) {
                    for (int k = 0; k < person.length; k++) {
                        if (k == i || k == j) {
                            continue;
                        }
                        System.out.println(person[k]);
                    }
                    return;
                }
            }
        }
    }
}
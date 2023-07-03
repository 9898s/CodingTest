import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] cntArr = new int[10];
        Scanner sc = new Scanner(System.in);

        int num = 1;
        for (int i = 0; i < 3; i++) {
            int n = sc.nextInt();

            num *= n;
        }

        while (num > 0) {
            cntArr[num % 10]++;
            num /= 10;
        }

        for (int item : cntArr) {
            System.out.println(item);
        }
    }
}

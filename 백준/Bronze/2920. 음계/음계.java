import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isAsc = true;
        boolean isDesc = true;

        for (int i = 1; i <= 8; i++) {
            int n = sc.nextInt();

            if (i != n) {
                isAsc = false;
            }
            if (i != 9 - n) {
                isDesc = false;
            }
        }

        if (isAsc) {
            System.out.println("ascending");
        } else if (isDesc) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
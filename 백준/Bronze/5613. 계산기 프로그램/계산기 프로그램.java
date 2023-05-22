import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;
        int type = 0;
        while (true) {
            String str = sc.nextLine();

            if (str.equals("+")) {
                type = 1;
            } else if (str.equals("-")) {
                type = 2;
            } else if (str.equals("*")) {
                type = 3;
            } else if (str.equals("/")) {
                type = 4;
            } else if (str.equals("=")) {
                break;
            } else {
                if (type == 0) {
                    answer = Integer.parseInt(str);
                } else if (type == 1) {
                    answer += Integer.parseInt(str);
                } else if (type == 2) {
                    answer -= Integer.parseInt(str);
                } else if (type == 3) {
                    answer *= Integer.parseInt(str);
                } else if (type == 4) {
                    answer /= Integer.parseInt(str);
                }
            }
        }
        System.out.println(answer);
    }
}
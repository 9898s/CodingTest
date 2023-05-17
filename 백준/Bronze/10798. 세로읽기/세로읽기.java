import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] text = new String[5];

        int max = 0;
        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            text[i] = str;
            max = Math.max(max, str.length());
        }

        int idx = 0;
        StringBuilder sb = new StringBuilder();

        while (idx < max) {
            for (int i = 0; i < text.length; i++) {
                if (text[i].length() > idx) {
                    sb.append(text[i].charAt(idx));
                }
            }
            idx++;
        }
        System.out.println(sb);
    }
}

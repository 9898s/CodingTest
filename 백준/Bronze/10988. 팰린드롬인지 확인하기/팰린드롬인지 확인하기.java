import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int left = 0;
        int right = str.length() - 1;

        boolean isCheck = false;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isCheck = true;
                break;
            }
            
            left++;
            right--;
        }

        System.out.println(isCheck ? 0 : 1);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {sc.nextInt(), sc.nextInt()};
        int[] arr2 = {sc.nextInt(), sc.nextInt()};
        int[] arr3 = {sc.nextInt(), sc.nextInt()};
        int[] arr4 = new int[2];

        if (arr1[0] == arr2[0]) {
            arr4[0] = arr3[0];
        } else if (arr1[0] == arr3[0]) {
            arr4[0] = arr2[0];
        } else if (arr2[0] == arr3[0]) {
            arr4[0] = arr1[0];
        }

        if (arr1[1] == arr2[1]) {
            arr4[1] = arr3[1];
        } else if (arr1[1] == arr3[1]) {
            arr4[1] = arr2[1];
        } else if (arr2[1] == arr3[1]) {
            arr4[1] = arr1[1];
        }
        System.out.println(arr4[0] + " " + arr4[1]);
    }
}

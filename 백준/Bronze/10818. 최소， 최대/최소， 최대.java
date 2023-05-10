import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0], min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			max = arr[i] > max ? arr[i] : max;
			min = arr[i] < min ? arr[i] : min;
		}
		System.out.printf("%d %d", min, max);
	}

}
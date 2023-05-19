import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);

        int answer = 0;
        if (arr[0] != arr[1] && arr[1] != arr[2]) {
            answer = a + b + c;
        } else if (arr[0] == arr[1] && arr[1] != arr[2] || arr[1] == arr[2] && arr[0] != arr[1]) {
            answer = (a + b + c) * (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        } else if (arr[0] == arr[2]) {
            answer = (a + b + c) * (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        }
        return answer;
    }
}
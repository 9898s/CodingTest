import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);

        int min = arr2[0];

        int[] answer = new int[]{-1};
        if (arr.length - 1 > 0) {
            answer = new int[arr.length - 1];

            int idx = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != min) {
                    answer[idx++] = arr[i];
                }
            }
        }
        return answer;
    }
}
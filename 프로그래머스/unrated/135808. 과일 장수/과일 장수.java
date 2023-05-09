import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int count = score.length / m;

        Arrays.sort(score);
        for (int i = 0; i < count; i++) {
            int idx = 0;
            int[] arr = new int[m];
            for (int j = score.length - 1 - i * m; j >= score.length - 1 - ((i + 1) * m - 1); j--) {
                arr[idx++] = score[j];
            }

            Arrays.sort(arr);
            answer += arr[0] * m;
        }
        System.out.println(answer);
        return answer;
    }
}
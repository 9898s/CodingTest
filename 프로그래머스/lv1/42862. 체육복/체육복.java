import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - reserve[j] == 0) {
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (Math.abs(lost[i] - reserve[j]) == 1) {
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }

        for (int item : lost) {
            if (item != -1) {
                answer--;
            }
        }
        return answer;
    }
}
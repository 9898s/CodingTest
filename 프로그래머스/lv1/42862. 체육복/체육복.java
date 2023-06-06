import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] count = new int[n];
        Arrays.fill(count, 1);
        
        for (int item : lost) {
            count[item - 1]--;
        }
        for (int item : reserve) {
            count[item - 1]++;
        }
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                if (i - 1 >= 0 && count[i - 1] == 2) {
                    count[i]++;
                    count[i - 1]--;
                } else if (i + 1 <= count.length - 1 && count[i + 1] == 2) {
                    count[i]++;
                    count[i + 1]--;
                }
            }
        }
        
        for (int item : count) {
            if (item > 0) {
                answer++;
            }
        }
        return answer;
    }
}
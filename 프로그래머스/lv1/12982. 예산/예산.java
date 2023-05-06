import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        int idx = d.length;
        while (idx > 0) {
            int sum = 0;
            for(int i = 0; i < idx; i++) {
                sum += d[i];
            }
            if(sum <= budget) {
                answer = idx;
                break;
            }
            idx--;
        }
        return answer;
    }
}
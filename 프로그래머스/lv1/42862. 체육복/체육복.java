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
                if (i == 0) {
                    if (count[i + 1] == 2) {
                        count[i]++;
                        count[i + 1]--;
                    }
                } else if (i == count.length - 1) {
                    if (count[i - 1] == 2) {
                        count[i]++;
                        count[i - 1]--;
                    }
                } else {
                    if (count[i - 1] == 2) {
                        count[i]++;
                        count[i - 1]--;
                    } else if (count[i + 1] == 2) {
                        count[i]++;
                        count[i + 1]--;
                    }
                }
            }
        }
        
        System.out.println(Arrays.toString(count));
        
        for (int item : count) {
            if (item > 0) {
                answer++;
            }
        }
        return answer;
    }
}
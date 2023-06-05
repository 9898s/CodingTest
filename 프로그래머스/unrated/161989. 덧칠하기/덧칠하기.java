class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] paint = new boolean[n];
        
        for (int item : section) {
            paint[item - 1] = true;
        }
        
        for (int item : section) {
            int idx = item - 1;
            if (paint[idx]) {
                int maxIdx = n <= idx + m ? n : idx + m;
                for (int i = idx; i < maxIdx; i++) {
                    paint[i] = false;
                }
                answer++;
            }
        }
        return answer;
    }
}
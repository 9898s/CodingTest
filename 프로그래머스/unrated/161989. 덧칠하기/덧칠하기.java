class Solution {
    public int solution(int n, int m, int[] section) {
        boolean[] paint = new boolean[n];
        for (int item : section) {
            paint[item - 1] = true;
        }

        int answer = 0;
        for (int item : section) {
            int idx = item - 1;
            if (paint[idx]) {
                int maxIdx = idx + m > n ? n : idx + m;

                for (int i = idx; i < maxIdx; i++) {
                    paint[i] = false;
                }
                answer++;
            }
        }
        return answer;
    }
}
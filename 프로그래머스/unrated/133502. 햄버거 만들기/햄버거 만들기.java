class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        int idx = 0;
        int[] stack = new int[ingredient.length + 1];

        for (int item : ingredient) {
            stack[idx++] = item;

            if (idx >= 4) {
                if (stack[idx - 1] == 1 && stack[idx - 2] == 3 && stack[idx - 3] == 2 && stack[idx - 4] == 1) {
                    answer++;
                    idx -= 4;
                }
            }
        }
        return answer;
    }
}
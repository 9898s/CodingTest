class Solution {
    public int solution(int a, int b) {
        int answer = 2 * a * b;
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b);
        answer = Math.max(answer, Integer.parseInt(sb.toString()));
        return answer;
    }
}
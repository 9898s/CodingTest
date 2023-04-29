class Solution {
    public int solution(int a, int b) {
        int answer = 2 * a * b;
        String number = String.valueOf(a) + String.valueOf(b);
        answer = Math.max(answer, Integer.parseInt(number));
        return answer;
    }
}
class Solution {
    public int solution(int a, int b) {
        String x = String.valueOf(a) + b;
        String y = String.valueOf(b) + a;

        int answer = Integer.parseInt(x) > Integer.parseInt(y) ? Integer.parseInt(x) : Integer.parseInt(y);
        return answer;
    }
}
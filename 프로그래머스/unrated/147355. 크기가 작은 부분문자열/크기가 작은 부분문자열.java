class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int size = p.length();
        for (int i = 0; i <= t.length() - size; i++) {
            long number = Long.parseLong(t.substring(i, i + size));
            if (number <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}
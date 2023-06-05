class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            int idx = sb.lastIndexOf(String.valueOf(s.charAt(i)));
            if (idx == -1) {
                answer[i] = idx;
            } else {
                answer[i] = i - idx;
            }
            sb.append(s.charAt(i));
        }
        return answer;
    }
}
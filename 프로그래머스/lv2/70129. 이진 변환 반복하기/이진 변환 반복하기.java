class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String s2 = "";
        int count = 0;

        while (!s.equals("1")) {
            s2 = s.replaceAll("0", "");
            count = s.length() - s2.length();
            s = Integer.toString(s2.length(), 2);
            
            answer[0]++;
            answer[1] += count;
        }
        return answer;
    }
}
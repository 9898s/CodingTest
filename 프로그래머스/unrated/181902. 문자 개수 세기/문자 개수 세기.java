class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(char ch : my_string.toCharArray()) {
            if(ch - 'a' < 0) {
                answer[ch - 'A']++;
            } else {
                answer[ch - 'a' + 26]++;
            }
        }
        return answer;
    }
}
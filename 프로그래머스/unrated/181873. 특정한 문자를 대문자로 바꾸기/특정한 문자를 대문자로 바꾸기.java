class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";

        for(char ch : my_string.toCharArray()) {
            if(ch == alp.charAt(0)) {
                ch = Character.toUpperCase(ch);
            }
            answer += ch;
        }
        return answer;
    }
}
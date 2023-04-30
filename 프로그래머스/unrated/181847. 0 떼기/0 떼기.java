class Solution {
    public String solution(String n_str) {
        StringBuilder answer = new StringBuilder();
        
        boolean isCheck = false;
        for(char ch : n_str.toCharArray()) {
            if(!isCheck) {
                if(ch == '0') {
                    continue;
                } else {
                    isCheck = true;
                    answer.append(ch);
                }
            } else {
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}
class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        
        int mode = 0;
        for(int i = 0; i < code.length(); i++) {
            if(mode == 0) {
                if(code.charAt(i) == '1') {
                    mode = 1;
                    continue;
                }
                if(i % 2 == 0) {
                    answer.append(code.charAt(i));
                }
            } else {
                if(code.charAt(i) == '1') {
                    mode = 0;
                    continue;
                }
                if(i % 2 == 1) {
                    answer.append(code.charAt(i));
                }
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}
class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if (code.charAt(i) == '1') {
                    mode = 1;
                    continue;
                }

                if (i % 2 == 0) {
                    sb.append(code.charAt(i));
                }
            } else if (mode == 1) {
                if (code.charAt(i) == '1') {
                    mode = 0;
                    continue;
                }

                if (i % 2 == 1) {
                    sb.append(code.charAt(i));
                }
            }
        }

        String answer = sb.toString();
        if(answer.isEmpty()) {
            answer = "EMPTY";
        }
        return answer;
    }
}
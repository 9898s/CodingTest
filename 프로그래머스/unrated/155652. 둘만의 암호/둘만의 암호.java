class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for (char c : s.toCharArray()) {
            int idx = 0, tmp = 0;
            String str = "";

            while (idx < index) {
                tmp++;
                if (c + tmp > 'z') {
                    c = 'a';
                    tmp = 0;
                }
                str = String.valueOf(Character.toChars(c + tmp));

                if (!skip.contains(str)) {
                    idx++;
                }
            }
            answer += str;
        }
        return answer;
    }
}
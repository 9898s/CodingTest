class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        String[] text = new String[str.length];

        for (int i = 0; i < str.length; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < str[i].length(); j++) {
                if (j == 0) {
                    sb.append(Character.toUpperCase(str[i].charAt(0)));
                } else {
                    sb.append(Character.toLowerCase(str[i].charAt(j)));
                }
            }
            text[i] = sb.toString();
        }
        String answer = String.join(" ", text);
        if (s.charAt(s.length() - 1) == ' ') {
            answer += ' ';
        }
        return answer;
    }
}
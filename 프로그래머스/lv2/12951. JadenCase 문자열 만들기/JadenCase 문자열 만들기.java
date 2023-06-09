class Solution {
    public String solution(String s) {
        s = s.toLowerCase();

        boolean isSpace = true;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                isSpace = true;
                sb.append(s.charAt(i));
            } else {
                if (isSpace) {
                    char ch = Character.toUpperCase(s.charAt(i));
                    isSpace = false;
                    sb.append(ch);
                } else {
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
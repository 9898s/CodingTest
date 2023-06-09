class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        
        boolean isSpace = true;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (isSpace) {
                sb.append(Character.toUpperCase(s.charAt(i)));
                isSpace = false;
            } else {
                sb.append(s.charAt(i));
            }

            if (s.charAt(i) == ' ') {
                isSpace = true;
            }
        }
        return sb.toString();
    }
}
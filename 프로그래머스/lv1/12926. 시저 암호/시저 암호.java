class Solution {
    public String solution(String s, int n) {
        StringBuffer sb = new StringBuffer();

        for (char item : s.toCharArray()) {
            if (item >= 'A' && item <= 'Z') {
                if (item + n <= 'Z') {
                    sb.append((char) (item + n));
                } else {
                    sb.append((char) (item + n - 26));
                }
            } else if (item >= 'a' && item <= 'z') {
                if (item + n <= 'z') {
                    sb.append((char) (item + n));
                } else {
                    sb.append((char) (item + n - 26));
                }
            } else {
                sb.append(item);
            }
        }
        return sb.toString();
    }
}
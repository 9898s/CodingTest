import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        StringBuffer sb = new StringBuffer();
        for (char ch : chars) {
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}
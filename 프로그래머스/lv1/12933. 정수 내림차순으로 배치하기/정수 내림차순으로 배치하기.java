import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;

        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);

        StringBuffer sb = new StringBuffer();
        for (char ch : chars) {
            sb.append(ch);
        }

        answer = Long.parseLong(sb.reverse().toString());
        return answer;
    }
}
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        StringBuffer sb = new StringBuffer();
        sb.append(n);

        Integer[] arr = new Integer[sb.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sb.charAt(i) - '0';
        }
        Arrays.sort(arr, Collections.reverseOrder());

        sb = new StringBuffer();
        for(int item : arr) {
            sb.append(item);
        }

        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}
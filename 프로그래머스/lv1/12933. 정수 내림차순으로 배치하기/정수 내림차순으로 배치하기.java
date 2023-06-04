import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;

        ArrayList<Long> list = new ArrayList<>();
        while (n != 0) {
            list.add(n % 10);
            n /= 10;
        }
        Collections.sort(list, Collections.reverseOrder());

        StringBuffer sb = new StringBuffer();
        for (long item : list) {
            sb.append(item);
        }

        answer = Long.parseLong(sb.toString());
        return answer;
    }
}
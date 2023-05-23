import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            String sub = intStrs[i].substring(s, s + l);

            if (Integer.parseInt(sub) > k) {
                list.add(Integer.parseInt(sub));
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
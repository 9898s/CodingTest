import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int item : array) {
            hm.put(item, hm.getOrDefault(item, 0) + 1);
        }

        int max = 0;
        for (int item : hm.keySet()) {
            max = Math.max(max, hm.get(item));
        }

        ArrayList<Integer> al = new ArrayList<>();
        for (int item : hm.keySet()) {
            if(hm.get(item) == max) {
                al.add(item);
            }
        }

        if(al.size() > 1) {
            return -1;
        }
        return al.get(0);
    }
}
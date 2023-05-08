import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i : nums) {
            if(set.size() >= nums.length / 2) {
                return nums.length / 2;
            }
            set.add(i);
        }
        return set.size();
    }
}
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] ss = s.split(" ");
        int[] nums = new int[ss.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(ss[i]);
        }

        Arrays.sort(nums);
        String answer = String.format("%d %d", nums[0], nums[nums.length - 1]);
        return answer;
    }
}
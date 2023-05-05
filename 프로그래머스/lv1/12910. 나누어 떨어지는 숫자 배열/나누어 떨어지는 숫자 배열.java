import java.util.TreeSet;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int item : arr) {
            if(item % divisor == 0) {
                set.add(item);
            }
        }
        
        if(set.size() == 0) {
            set.add(-1);
        }
        
        int[] answer = set.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
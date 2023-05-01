import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for(String str : intStrs) {
            String s2 = str.substring(s, s + l);
            if(Integer.parseInt(s2) > k) {
                numbers.add(Integer.parseInt(s2));
            }
        }
        
        int[] answer = numbers.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
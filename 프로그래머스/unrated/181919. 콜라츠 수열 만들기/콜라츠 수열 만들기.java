import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        while (n > 1) {
            numbers.add(n);
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        }
        numbers.add(1);
        
        int[] answer = numbers.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
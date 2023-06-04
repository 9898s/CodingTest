import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split(" ");
        int[] numbers = new int[str.length];
        
        for (int i = 0; i < str.length; i++) {
            numbers[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(numbers);
        
        answer = numbers[0] + " " + numbers[numbers.length - 1];
        return answer;
    }
}
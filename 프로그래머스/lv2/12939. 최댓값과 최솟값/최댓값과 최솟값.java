import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");

        int[] number = new int[str.length];
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(number);
        String answer = number[0] + " " + number[number.length - 1];
        return answer;
    }
}
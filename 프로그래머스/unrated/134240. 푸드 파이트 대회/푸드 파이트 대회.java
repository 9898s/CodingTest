class Solution {
    public String solution(int[] food) {
        String answer = "0";
        
        for (int i = 0; i < food.length; i++) {
            if (food[i] % 2 == 1) {
                food[i]--;
            }
        }
        
        for (int i = food.length - 1; i > 0; i--) {
            String text = String.valueOf(i).repeat(food[i] / 2);
            answer = text + answer + text;
        }
        return answer;
    }
}
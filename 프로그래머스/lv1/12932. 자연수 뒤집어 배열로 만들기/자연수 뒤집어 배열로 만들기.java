class Solution {
    public int[] solution(long n) {
        StringBuffer number = new StringBuffer();
        number.append(n);
        number.reverse();
        
        int[] answer = new int[number.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = number.charAt(i) - '0';
        }
        return answer;
    }
}
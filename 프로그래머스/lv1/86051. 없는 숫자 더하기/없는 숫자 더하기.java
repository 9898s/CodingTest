class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] check = new boolean[10];

        for(int item : numbers) {
            check[item] = true;
        }

        for(int i = 0; i < check.length; i++) {
            if(!check[i]) {
                answer += i;
            }
        }
        return answer;
    }
}
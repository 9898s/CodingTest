class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        int bottle = n;
        
        while (bottle >= a) {
            answer += bottle / a * b;
            bottle = bottle - (bottle / a) * a + (bottle / a * b);
            System.out.println(bottle);
        }
        return answer;
    }
}
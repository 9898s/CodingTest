class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        for(int i = price; i <= price * count; i += price) {
            total += i;
        }
        
        long answer = total > money ? total - money : 0;
        return answer;
    }
}
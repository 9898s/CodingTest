class Solution {
    public int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
    
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    
    public int solution(int number, int n, int m) {
        int answer = number % lcm(n, m) == 0 ? 1 : 0;
        return answer;
    }
}
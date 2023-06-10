class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }
    
    public int gcd(int i, int j) {
        if (i % j == 0) {
            return j;
        }
        return gcd(j, i % j);
    }
    
    public int lcm(int i, int j) {
        return i * j / gcd(i, j);
    }
}
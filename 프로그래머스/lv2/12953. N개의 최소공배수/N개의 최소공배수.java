class Solution {
    public int solution(int[] arr) {
        /*
        배열 원소들의 최소 공배수를 구해주면 된다.
        최소 공배수 구하는 방법: 두 원소의 곱 / 두 원소의 최대 공약수
        */
        
        int answer = 1;
        for(int item : arr) {
            answer = lcm(answer, item);
        }
        return answer;
    }
    
    public int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
    
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
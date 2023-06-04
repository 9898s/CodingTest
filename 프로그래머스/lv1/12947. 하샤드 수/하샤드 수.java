class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum = 0;
        char[] chars = String.valueOf(x).toCharArray();
        
        for (char ch : chars) {
            sum += ch - '0';
        }
        
        if (x % sum != 0) {
            answer = false;
        }
        return answer;
    }
}
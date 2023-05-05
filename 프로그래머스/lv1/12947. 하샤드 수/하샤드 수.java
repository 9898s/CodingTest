class Solution {
    public boolean solution(int x) {
        int sum = 0;
        for(char ch : String.valueOf(x).toCharArray()) {
            sum += ch - '0';
        }
        return x % sum == 0 ? true : false;
    }
}
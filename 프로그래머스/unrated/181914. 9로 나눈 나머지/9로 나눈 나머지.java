class Solution {
    public int solution(String number) {
        int answer = 0;
        
        int sum = 0;
        for (String str : number.split("")) {
            sum += Integer.parseInt(str);
        }
        
        answer = sum % 9;
        return answer;
    }
}
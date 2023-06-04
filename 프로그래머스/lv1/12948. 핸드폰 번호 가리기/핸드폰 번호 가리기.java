class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        int count = phone_number.length() - 4;
        String endString = phone_number.substring(phone_number.length() - 4);
        
        answer = "*".repeat(count) + endString;
        return answer;
    }
}
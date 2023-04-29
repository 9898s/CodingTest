class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        myString = myString.replace("A", "1").replace("B", "A").replace("1", "B");
        if(myString.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}
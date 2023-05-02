class Solution {
    public String solution(String myString, String pat) {
        StringBuffer answer = new StringBuffer();

        int idx = myString.lastIndexOf(pat);
        answer.append(myString.substring(0, idx + pat.length()));
        return answer.toString();
    }
}
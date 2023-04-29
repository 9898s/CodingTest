class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        String[] text = new String[my_string.length()];
        for(int i = 0; i < text.length; i++) {
            text[i] = my_string.substring(i);
        }
        
        for(String str : text) {
            if(str.equals(is_suffix)) {
                answer = 1;
            }
        }
        return answer;
    }
}
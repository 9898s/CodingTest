class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        String[] text = new String[my_string.length()];
        for(int i = 0; i < text.length; i++) {
            text[i] = my_string.substring(0, i + 1);
        }
        
        for(String str : text) {
            if(str.equals(is_prefix)) {
                answer = 1;
            }
        }
        return answer;
    }
}
class Solution {
    public int[] solution(String myString) {
        String[] text = myString.split("x");

        int size = 0;
        for(char ch : myString.toCharArray()) {
            if(ch == 'x') {
                size++;
            }
        }

        int[] answer = new int[size + 1];
        for(int i = 0; i < text.length; i++) {
            answer[i] = text[i].length();
        }
        return answer;
    }
}
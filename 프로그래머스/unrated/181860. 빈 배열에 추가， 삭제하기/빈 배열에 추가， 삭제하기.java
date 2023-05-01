class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        StringBuffer text = new StringBuffer();
        for(int i = 0; i < flag.length; i++) {
            if(flag[i]) {
                text.append(String.valueOf(arr[i]).repeat(arr[i] * 2));
            } else {
                text.delete(text.length() - arr[i], text.length());
            }
        }
        int[] answer = text.chars().toArray();
        for(int i = 0; i < answer.length; i++) {
            answer[i] -= 48;
        }
        return answer;
    }
}
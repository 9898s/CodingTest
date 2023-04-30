class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length - 1) / 5 + 1];

        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                answer[count++] = names[i];
            }
        }
        return answer;
    }
}
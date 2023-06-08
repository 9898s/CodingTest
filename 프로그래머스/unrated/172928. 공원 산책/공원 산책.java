class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        
        for (String str : routes) {
            int step = str.charAt(2) - '0';
            int beforeX = answer[1];
            int beforeY = answer[0];
            boolean isValid = true;
            
            for (int i = 0; i < step; i++) {
                if (str.charAt(0) == 'E') {
                    answer[1]++;
                } else if (str.charAt(0) == 'W') {
                    answer[1]--;
                } else if (str.charAt(0) == 'N') {
                    answer[0]--;
                } else if (str.charAt(0) == 'S') {
                    answer[0]++;
                }
                
                if (answer[1] >= park[1].length() || answer[1] < 0) {
                    isValid = false;
                    break;
                }
                if (answer[0] >= park.length || answer[0] < 0) {
                    isValid = false;
                    break;
                }
                if (park[answer[0]].charAt(answer[1]) == 'X') {
                    isValid = false;
                    break;
                }
            }
            
            if (!isValid) {
                answer[1] = beforeX;
                answer[0] = beforeY;
            }
        }
        return answer;
    }
}
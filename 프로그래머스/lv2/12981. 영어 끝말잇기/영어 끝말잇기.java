import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        /*
        1. 지금 말한 단어가 앞에서 말했던 단어인지 체크해준다.
        2. 앞에서 말했던 단어의 끝자리 문자와 지금 말한 단어의 앞자리 문자가 같은지 체크해준다.
        */
        
        int[] answer = new int[2];
        HashMap<String, String> hm = new HashMap<>();
        
        for (int i = 0; i < words.length; i++) {
            // 1번 조건
            if(hm.containsKey(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            
            // 2번 조건
            if (i > 0) {
                if (words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    break;
                }
            }
            hm.put(words[i], words[i]);
        }
        return answer;
    }
}
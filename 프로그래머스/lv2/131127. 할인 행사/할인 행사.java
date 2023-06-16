import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        /*
        1. HashMap에 want와 number를 넣어준다.
        2. 반복문을 돌려서 0 ~ 10, 1 ~ 11, 2 ~ 12일 수에 할인 물건을 확인해준다.
            - 10, 11, 12 등등의 할인 일수가 discount의 값을 넘어간다면 maxLength = discount.length
        */
        
        int answer = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < want.length; i++) {
            hm.put(want[i], number[i]);
        }
        
        int idx = 0;
        while (idx + 10 <= discount.length) {
            HashMap<String, Integer> hm2 = new HashMap<>();
            
            for (int i = idx; i < idx + 10; i++) {
                hm2.put(discount[i], hm2.getOrDefault(discount[i], 0) + 1);
            }
            
            boolean isFlag = true;
            for (String str : hm.keySet()) {
                if (!hm2.containsKey(str)) {
                    isFlag = false;
                    break;
                } else {
                    if (hm.get(str) > hm2.get(str)) {
                        isFlag = false;
                        break;
                    }
                }
            }
            
            if (isFlag) {
                answer++;
            }
            
            idx++;
        }
        return answer;
    }
}
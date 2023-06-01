import java.util.HashMap;

class Solution {
    public int[] solution(int brown, int yellow) {
        int weight = 0;
        int height = 0;

        int[] answer = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 1; i * i <= yellow; i++) {
            if (i * i == yellow) {
                weight = i;
                height = i;

                hashMap.put(weight, height);
            } else if (yellow % i == 0) {
                weight = yellow / i;
                height = i;

                hashMap.put(weight, height);
            }
        }

        for (int i : hashMap.keySet()) {
            if ((i + 2) * (hashMap.get(i) + 2) - i * hashMap.get(i) == brown) {
                answer[0] = i + 2;
                answer[1] = hashMap.get(i) + 2;
                break;
            }
        }
        return answer;
    }
}
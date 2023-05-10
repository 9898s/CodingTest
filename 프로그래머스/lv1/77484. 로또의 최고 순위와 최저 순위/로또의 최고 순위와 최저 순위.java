import java.util.HashMap;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        HashMap<Integer, Boolean> hm = new HashMap<>();

        for (int item : lottos) {
            if (item == 0) {
                zero++;
                continue;
            }

            hm.put(item, true);
        }

        int win = 0;
        for (int item : win_nums) {
            if (hm.containsKey(item)) {
                win++;
            }
        }

        int[] answer = {getRank(zero + win), getRank(win)};
        return answer;
    }
    
    public static int getRank(int answer) {
        if (answer == 6) {
            return 1;
        } else if (answer == 5) {
            return 2;
        } else if (answer == 4) {
            return 3;
        } else if (answer == 3) {
            return 4;
        } else if (answer == 2) {
            return 5;
        } else {
            return 6;
        }
    }
}
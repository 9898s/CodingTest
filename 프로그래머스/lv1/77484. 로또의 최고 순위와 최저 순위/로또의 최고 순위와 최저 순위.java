class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int zeroCnt = 0;
        for (int item : lottos) {
            if (item == 0) {
                zeroCnt++;
            }
        }
        
        int win = 0;
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    win++;
                }
            }
        }
        answer[0] = ranking(zeroCnt + win);
        answer[1] = ranking(win);
        return answer;
    }
    
    public int ranking(int win) {
        if (win == 6) {
            return 1;
        } else if (win == 5) {
            return 2;
        } else if (win == 4) {
            return 3;
        } else if (win == 3) {
            return 4;
        } else if (win == 2) {
            return 5;
        } else {
            return 6;
        }
    }
}
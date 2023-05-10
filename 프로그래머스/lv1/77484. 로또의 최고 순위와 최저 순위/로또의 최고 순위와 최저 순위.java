import java.util.ArrayList;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int item : lottos) {
            al.add(item);
        }

        int count = 0;
        for (int i = 0; i < win_nums.length; i++) {
            if (al.contains(win_nums[i])) {
                count++;
            }
        }

        int bonus = 0;
        for (int item : lottos) {
            if (item == 0) {
                bonus++;
            }
        }

        int[] answer = {getRank(count + bonus), getRank(count)};
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
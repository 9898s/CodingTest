import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        
        // 모두 같음
        if(dice[0] == dice[3]) {
            answer = 1111 * dice[0];
        }
        
        // 세 주사위
        else if(dice[0] == dice[2] && dice[2] != dice[3]) {
            answer = (int)Math.pow(10 * dice[0] + dice[3], 2);
        } else if(dice[1] == dice[3] && dice[0] != dice[1]) {
            answer = (int)Math.pow(10 * dice[1] + dice[0], 2);
        } 
        
        // 두 주사위 1
        else if(dice[0] == dice[1] && dice[2] == dice[3] && dice[1] != dice[2]) {
            answer = (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
        }
        
        // 두 주사위 2
        else if(dice[0] == dice[1] && dice[1] != dice[2] && dice[2] != dice[3]) {
            answer = dice[2] * dice[3];
        } else if(dice[1] == dice[2] && dice[0] != dice[1] && dice[0] != dice[3]) {
            answer = dice[0] * dice[3];
        } else if(dice[2] == dice[3] && dice[0] != dice[2] && dice[0] != dice[1]) {
            answer = dice[0] * dice[1];
        } 
        
        // 네 주사위
        else if(dice[0] != dice[1] && dice[1] != dice[2] && dice[2] != dice[3]) {
            answer = dice[0];
        }
        return answer;
    }
}
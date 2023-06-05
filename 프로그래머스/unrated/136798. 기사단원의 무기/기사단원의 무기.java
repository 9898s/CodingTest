class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] damage = new int[number];
        
        for (int i = 0; i < damage.length; i++) {
            damage[i] = getDivisor(i + 1);
            if (damage[i] > limit) {
                damage[i] = power;
            }
        }
        
        for (int item : damage) {
            answer += item;
        }
        return answer;
    }
    
    public int getDivisor(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                count++;
            } else if (num % i == 0) {
                count += 2;
            }
        }
        return count;
    }
}
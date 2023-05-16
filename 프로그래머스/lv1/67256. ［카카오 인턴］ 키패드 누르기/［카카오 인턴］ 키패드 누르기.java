class Solution {
    public static int count(int pad, int hand) {
        if (pad == 2) {
            if (hand == 1 || hand == 5 || hand == 3) return 1;
            else if (hand == 4 || hand == 8 || hand == 6) return 2;
            else if (hand == 7 || hand == 0 || hand == 9) return 3;
            else if (hand == 11 || hand == 13) return 4;
        } else if (pad == 5) {
            if (hand == 2 || hand == 4 || hand == 6 || hand == 8) return 1;
            else if (hand == 1 || hand == 3 || hand == 7 || hand == 9 || hand == 0) return 2;
            else if (hand == 11 || hand == 13) return 3;
        } else if (pad == 8) {
            if (hand == 5 || hand == 7 || hand == 9 || hand == 0) return 1;
            else if (hand == 2 || hand == 4 || hand == 6 || hand == 11 || hand == 13) return 2;
            else if (hand == 1 || hand == 3) return 3;
        } else if (pad == 0) {
            if (hand == 8 || hand == 11 || hand == 13) return 1;
            else if (hand == 7 || hand == 5 || hand == 9) return 2;
            else if (hand == 4 || hand == 2 || hand == 6) return 3;
            else if (hand == 1 || hand == 3) return 4;
        }
        return -1;
    }
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] hands = {11, 13};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                hands[0] = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                hands[1] = numbers[i];
            } else {
                if (count(numbers[i], hands[0]) == count(numbers[i], hands[1])) {
                    // 왼손 잡이
                    if (hand.equals("left")) {
                        answer += "L";
                        hands[0] = numbers[i];
                    } else if (hand.equals("right")) {
                        answer += "R";
                        hands[1] = numbers[i];
                    }
                } else if (count(numbers[i], hands[0]) < count(numbers[i], hands[1])) {
                    answer += "L";
                    hands[0] = numbers[i];
                } else if (count(numbers[i], hands[0]) > count(numbers[i], hands[1])) {
                    answer += "R";
                    hands[1] = numbers[i];
                }
            }
        }
        return answer;
    }
}
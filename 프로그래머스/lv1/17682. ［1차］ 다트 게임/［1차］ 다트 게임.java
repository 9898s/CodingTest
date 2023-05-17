class Solution {
    public int solution(String dartResult) {
        int idx = 0;
        int[] dart = new int[3];

        String number = "";
        for (char ch : dartResult.toCharArray()) {

            if (Character.isDigit(ch)) {
                number += ch;
            } else {
                if (ch == 'S') {
                    dart[idx++] = Integer.parseInt(number);
                    number = "";
                } else if (ch == 'D') {
                    dart[idx++] = (int) Math.pow(Integer.parseInt(number), 2);
                    number = "";
                } else if (ch == 'T') {
                    dart[idx++] = (int) Math.pow(Integer.parseInt(number), 3);
                    number = "";
                } else if (ch == '#') {
                    dart[idx - 1] *= -1;
                } else if (ch == '*') {
                    dart[idx - 1] *= 2;
                    if (idx > 1) {
                        dart[idx - 2] *= 2;
                    }
                }
            }
        }

        int answer = 0;
        for (int item : dart) {
            answer += item;
        }
        return answer;
    }
}
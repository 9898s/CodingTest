class Solution {
    public int solution(String[] babbling) {
        String[] str = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (babbling[i].contains(str[j])) {
                    babbling[i] = babbling[i].replace(str[j], String.valueOf(j));
                }
            }
        }

        int answer = 0;
        for (String s : babbling) {
            if (isNumberic(s)) {
                int same = -1;
                boolean isSame = false;
                for (char ch : s.toCharArray()) {
                    if (ch - '0' != same) {
                        same = ch - '0';
                    } else {
                        isSame = true;
                    }
                }

                if (!isSame) {
                    answer++;
                }
            }
        }
        return answer;
    }
    
    public static boolean isNumberic(String str) {
        for (char ch : str.toCharArray()) {
            if (ch - '0' > 9 || ch - '0' < 0) {
                return false;
            }
        }
        return true;
    }
}
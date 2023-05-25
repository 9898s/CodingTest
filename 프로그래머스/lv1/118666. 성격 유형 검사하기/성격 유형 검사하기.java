import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('R', 0);
        hm.put('C', 0);
        hm.put('J', 0);
        hm.put('A', 0);
        
        for (int i = 0; i < survey.length; i++) {
            char surChar;

            if (survey[i].charAt(0) == 'R') {
                surChar = 'R';
                if (choices[i] == 1) {
                    hm.put(surChar, hm.get(surChar) + 3);
                } else if (choices[i] == 2) {
                    hm.put(surChar, hm.get(surChar) + 2);
                } else if (choices[i] == 3) {
                    hm.put(surChar, hm.get(surChar) + 1);
                } else if (choices[i] == 5) {
                    hm.put(surChar, hm.get(surChar) - 1);
                } else if (choices[i] == 6) {
                    hm.put(surChar, hm.get(surChar) - 2);
                } else if (choices[i] == 7) {
                    hm.put(surChar, hm.get(surChar) - 3);
                }
            } else if (survey[i].charAt(0) == 'T') {
                surChar = 'R';
                if (choices[i] == 1) {
                    hm.put(surChar, hm.get(surChar) - 3);
                } else if (choices[i] == 2) {
                    hm.put(surChar, hm.get(surChar) - 2);
                } else if (choices[i] == 3) {
                    hm.put(surChar, hm.get(surChar) - 1);
                } else if (choices[i] == 5) {
                    hm.put(surChar, hm.get(surChar) + 1);
                } else if (choices[i] == 6) {
                    hm.put(surChar, hm.get(surChar) + 2);
                } else if (choices[i] == 7) {
                    hm.put(surChar, hm.get(surChar) + 3);
                }
            }

            if (survey[i].charAt(0) == 'C') {
                surChar = 'C';
                if (choices[i] == 1) {
                    hm.put(surChar, hm.get(surChar) + 3);
                } else if (choices[i] == 2) {
                    hm.put(surChar, hm.get(surChar) + 2);
                } else if (choices[i] == 3) {
                    hm.put(surChar, hm.get(surChar) + 1);
                } else if (choices[i] == 5) {
                    hm.put(surChar, hm.get(surChar) - 1);
                } else if (choices[i] == 6) {
                    hm.put(surChar, hm.get(surChar) - 2);
                } else if (choices[i] == 7) {
                    hm.put(surChar, hm.get(surChar) - 3);
                }
            } else if (survey[i].charAt(0) == 'F') {
                surChar = 'C';
                if (choices[i] == 1) {
                    hm.put(surChar, hm.get(surChar) - 3);
                } else if (choices[i] == 2) {
                    hm.put(surChar, hm.get(surChar) - 2);
                } else if (choices[i] == 3) {
                    hm.put(surChar, hm.get(surChar) - 1);
                } else if (choices[i] == 5) {
                    hm.put(surChar, hm.get(surChar) + 1);
                } else if (choices[i] == 6) {
                    hm.put(surChar, hm.get(surChar) + 2);
                } else if (choices[i] == 7) {
                    hm.put(surChar, hm.get(surChar) + 3);
                }
            }

            if (survey[i].charAt(0) == 'J') {
                surChar = 'J';
                if (choices[i] == 1) {
                    hm.put(surChar, hm.get(surChar) + 3);
                } else if (choices[i] == 2) {
                    hm.put(surChar, hm.get(surChar) + 2);
                } else if (choices[i] == 3) {
                    hm.put(surChar, hm.get(surChar) + 1);
                } else if (choices[i] == 5) {
                    hm.put(surChar, hm.get(surChar) - 1);
                } else if (choices[i] == 6) {
                    hm.put(surChar, hm.get(surChar) - 2);
                } else if (choices[i] == 7) {
                    hm.put(surChar, hm.get(surChar) - 3);
                }
            } else if (survey[i].charAt(0) == 'M') {
                surChar = 'J';
                if (choices[i] == 1) {
                    hm.put(surChar, hm.get(surChar) - 3);
                } else if (choices[i] == 2) {
                    hm.put(surChar, hm.get(surChar) - 2);
                } else if (choices[i] == 3) {
                    hm.put(surChar, hm.get(surChar) - 1);
                } else if (choices[i] == 5) {
                    hm.put(surChar, hm.get(surChar) + 1);
                } else if (choices[i] == 6) {
                    hm.put(surChar, hm.get(surChar) + 2);
                } else if (choices[i] == 7) {
                    hm.put(surChar, hm.get(surChar) + 3);
                }
            }

            if (survey[i].charAt(0) == 'A') {
                surChar = 'A';
                if (choices[i] == 1) {
                    hm.put(surChar, hm.get(surChar) + 3);
                } else if (choices[i] == 2) {
                    hm.put(surChar, hm.get(surChar) + 2);
                } else if (choices[i] == 3) {
                    hm.put(surChar, hm.get(surChar) + 1);
                } else if (choices[i] == 5) {
                    hm.put(surChar, hm.get(surChar) - 1);
                } else if (choices[i] == 6) {
                    hm.put(surChar, hm.get(surChar) - 2);
                } else if (choices[i] == 7) {
                    hm.put(surChar, hm.get(surChar) - 3);
                }
            } else if (survey[i].charAt(0) == 'N') {
                surChar = 'A';
                if (choices[i] == 1) {
                    hm.put(surChar, hm.get(surChar) - 3);
                } else if (choices[i] == 2) {
                    hm.put(surChar, hm.get(surChar) - 2);
                } else if (choices[i] == 3) {
                    hm.put(surChar, hm.get(surChar) - 1);
                } else if (choices[i] == 5) {
                    hm.put(surChar, hm.get(surChar) + 1);
                } else if (choices[i] == 6) {
                    hm.put(surChar, hm.get(surChar) + 2);
                } else if (choices[i] == 7) {
                    hm.put(surChar, hm.get(surChar) + 3);
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        if (hm.get('R') >= 0) {
            sb.append('R');
        } else {
            sb.append('T');
        }

        if (hm.get('C') >= 0) {
            sb.append('C');
        } else {
            sb.append('F');
        }

        if (hm.get('J') >= 0) {
            sb.append('J');
        } else {
            sb.append('M');
        }

        if (hm.get('A') >= 0) {
            sb.append('A');
        } else {
            sb.append('N');
        }
        return sb.toString();
    }
}
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] todayString = today.split("[. ]");

        int[] todayArr = new int[3];
        for (int i = 0; i < todayArr.length; i++) {
            todayArr[i] = Integer.parseInt(todayString[i]);
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] termsString = terms[i].split(" ");

            for (int j = 0; j < termsString.length; j++) {
                hm.put(termsString[0].charAt(0), Integer.parseInt(termsString[1]));
            }
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] privaciesString = privacies[i].split("[. ]");

            int addMonth = hm.get(privaciesString[3].charAt(0));

            int year = Integer.parseInt(privaciesString[0]);
            int month = Integer.parseInt(privaciesString[1]);
            int day = Integer.parseInt(privaciesString[2]);

            year += addMonth / 12;
            month += addMonth % 12;
            if (month > 12) {
                year++;
                month %= 12;
            }
            day--;

            if (day == 0) {
                month--;
                day = 28;
            }
            if (month == 0) {
                year--;
                month = 12;
            }

            if (todayArr[0] > year) {
                list.add(i + 1);
            } else if (todayArr[0] == year) {
                if (todayArr[1] > month) {
                    list.add(i + 1);
                } else if (todayArr[1] == month) {
                    if (todayArr[2] > day) {
                        list.add(i + 1);
                    }
                }
            }
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
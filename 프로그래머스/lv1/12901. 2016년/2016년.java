import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        LocalDate date = LocalDate.of(2016, a, b);
        int num = date.getDayOfWeek().getValue() % 7;
        return day[num];
    }
}
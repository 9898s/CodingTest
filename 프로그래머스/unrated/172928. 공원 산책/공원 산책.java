class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[][] bomb = new int[park.length][park.length];
        for (int i = 0; i < bomb.length; i++) {
            for (int j = 0; j < bomb[i].length; j++) {
                bomb[i][j] = -1;
            }
        }

        int beforeX = 0, beforeY = 0;
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    beforeX = i;
                    beforeY = j;
                }
                if (park[i].charAt(j) == 'X') {
                    bomb[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            int backupX = beforeX, backupY = beforeY;
            int moveX = 0, moveY = 0;

            if (routes[i].charAt(0) == 'E') {
                moveY = routes[i].charAt(2) - '0';

                while (moveY > 0) {
                    backupY++;
                    moveY--;

                    if (backupY < 0 || backupY >= park[0].length() || bomb[beforeX][backupY] == 1) {
                        backupY = beforeY;
                        break;
                    }
                }
                beforeY = backupY;
            } else if (routes[i].charAt(0) == 'W') {
                moveY = routes[i].charAt(2) - '0';

                while (moveY > 0) {
                    backupY--;
                    moveY--;

                    if (backupY < 0 || backupY >= park[0].length() || bomb[beforeX][backupY] == 1) {
                        backupY = beforeY;
                        break;
                    }
                }
                beforeY = backupY;
            } else if (routes[i].charAt(0) == 'S') {
                moveX = routes[i].charAt(2) - '0';

                while (moveX > 0) {
                    backupX++;
                    moveX--;

                    if (backupX < 0 || backupX >= park.length || bomb[backupX][beforeY] == 1) {
                        backupX = beforeX;
                        break;
                    }
                }
                beforeX = backupX;
            } else if (routes[i].charAt(0) == 'N') {
                moveX = routes[i].charAt(2) - '0';

                while (moveX > 0) {
                    backupX--;
                    moveX--;

                    if (backupX < 0 || backupX >= park.length || bomb[backupX][beforeY] == 1) {
                        backupX = beforeX;
                        break;
                    }
                }
                beforeX = backupX;
            }
        }

        int[] answer = {beforeX, beforeY};
        return answer;
    }
}
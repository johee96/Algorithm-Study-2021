package programmers.level2;

import java.util.ArrayList;
import java.util.Stack;

public class 기능개발 {
    public static void main(String[] args) {

    }

    class 기능개발_Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            int[] answer = {};
            int[] days = new int[progresses.length];
            for (int i = 0; i < progresses.length; i++) {
                days[i] = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
            }
            ArrayList<Integer> ansList = new ArrayList<>();
            int targetDay = days[0];
            int features = 1;
            for (int i = 1; i < days.length; i++) {
                if (targetDay >= days[i]) {
                    features++;
                    continue;
                }
                ansList.add(features);
                targetDay = days[i];
                features = 1;
            }
            ansList.add(features);

            answer = new int[ansList.size()];
            for (int i = 0; i < ansList.size(); i++) {
                answer[i] = ansList.get(i);
            }

            return answer;
        }
    }
}

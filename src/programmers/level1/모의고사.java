package programmers.level1;

import java.util.ArrayList;

public class 모의고사 {
    public static void main(String[] args) {

    }

    class 모의고사_Solution {
        public int[] solution(int[] answers) {
            int[] answer = {};
            int[] p1 = {1, 2, 3, 4, 5};
            int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            int[] score = new int[3];

            int winnerScore = -1;
            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == p1[i % 5]) {
                    score[0]++;
                    if (winnerScore < score[0])
                        winnerScore = score[0];
                }
                if (answers[i] == p2[i % 8]) {
                    score[1]++;
                    if (winnerScore < score[1])
                        winnerScore = score[1];
                }
                if (answers[i] == p3[i % 10]) {
                    score[2]++;
                    if (winnerScore < score[2])
                        winnerScore = score[2];
                }

            }
            ArrayList<Integer> winners = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                if (winnerScore == score[i])
                    winners.add(i + 1);
            }

            answer = new int[winners.size()];
            for (int i = 0; i < winners.size(); i++)
                answer[i] = winners.get(i);

            return answer;
        }
    }
}

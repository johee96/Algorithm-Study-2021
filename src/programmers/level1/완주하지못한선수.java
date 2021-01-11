package programmers.level1;
//2021.01.11

import java.util.*;

public class 완주하지못한선수 {
    public static void main(String[] args) {

    }

    class 완주하지못한선수_Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            HashMap<String, Integer> participantMap = new HashMap<>();
            for (int i = 0; i < participant.length; i++) {
                participantMap.put(participant[i], participantMap.getOrDefault(participant[i], 0) + 1);
            }
            for (int i = 0; i < completion.length; i++) {
                participantMap.put(completion[i], participantMap.getOrDefault(completion[i], 0) - 1);
            }
            for (String name : participantMap.keySet()) {
                if (participantMap.get(name) > 0) {
                    answer = name;
                    break;
                }
            }
            return answer;
        }
    }
}

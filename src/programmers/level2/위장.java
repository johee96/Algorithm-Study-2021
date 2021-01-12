package programmers.level2;

import java.util.HashMap;

public class 위장 {
    public static void main(String[] args) {

    }

    class 위장_Solution {
        public int solution(String[][] clothes) {
            int answer = 1;
            HashMap<String, Integer> clothesMap = new HashMap<>();
            for (int i = 0; i < clothes.length; i++) {
                clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0) + 1);
            }

            for (String key : clothesMap.keySet()) {
                answer *= (clothesMap.get(key) + 1);
            }
            answer -= 1;
            return answer;
        }
    }
}

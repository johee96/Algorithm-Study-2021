package programmers.level2;

public class 카펫 {
    public static void main(String[] args) {

    }

    class 카펫_Solution {
        public int[] solution(int brown, int yellow) {
            int[] answer = {};
            answer = new int[2];
            for (int i = yellow; i >= 1; i--) {
                if (yellow % i != 0) continue;
                if (2 * i + 2 * (yellow / i) + 4 != brown) continue;

                answer[0] = i + 2;
                answer[1] = (yellow / i) + 2;
                break;
            }
            return answer;
        }
    }
}

package programmers.level2;

import java.util.Stack;

public class 주식가격 {
    public static void main(String[] args) {

    }

    class 주식가격_Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
            Stack<int[]> stack = new Stack<>();

            for (int i = prices.length - 2; i >= 0; i--) {
                int day = 0;
                while (!stack.isEmpty() && stack.peek()[1] >= prices[i]) {
                    day += stack.pop()[0];
                }
                stack.push(new int[]{day + 1, prices[i]});
                answer[i] = day + 1;
            }

            return answer;
        }
    }
}

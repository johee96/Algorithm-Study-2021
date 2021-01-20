package programmers.level2;

import java.util.HashSet;

public class 소수찾기 {
    public static void main(String[] args) {

    }

    class Solution {
        HashSet<Integer> data;

        public int solution(String numbers) {
            data = new HashSet<>();
            makeNum(numbers, new StringBuilder(), new boolean[numbers.length()]);
            return data.size();
        }

        public void makeNum(String numbers, StringBuilder value, boolean[] visited) {
            if (numbers.length() == value.length()) return;
            for (int i = 0; i < numbers.length(); i++) {
                if (visited[i]) continue;
                visited[i] = true;
                value = value.append(numbers.charAt(i));
                int intValue = Integer.parseInt(value.toString());
                if (isPrimeNum(intValue)) data.add(intValue);

                makeNum(numbers, value, visited);
                visited[i] = false;
                value = value.deleteCharAt(value.length() - 1);
            }
        }

        public boolean isPrimeNum(int num) {
            if (num <= 1) return false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    }
}

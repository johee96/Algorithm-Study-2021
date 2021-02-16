package programmers.level3;

public class 단어변환 {
    public static void main(String[] args) {

    }

    class 단어변환_Solution {
        int answer = Integer.MAX_VALUE;

        public int solution(String begin, String target, String[] words) {
            dfs(new boolean[words.length], 0, begin, target, words);
            if (answer == Integer.MAX_VALUE)
                answer = 0;
            return answer;
        }

        public void dfs(boolean[] visited, int cnt, String tmpStr, String target, String[] words) {
            if (tmpStr.equals(target)) {
                answer = Math.min(cnt, answer);
                return;
            }

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && checkStr(tmpStr, words[i])) {
                    visited[i] = true;
                    dfs(visited, cnt + 1, words[i], target, words);
                    visited[i] = false;
                }
            }

        }

        public boolean checkStr(String tmpStr, String target) {
            int cnt = 0;
            for (int i = 0; i < target.length(); i++) {
                if (tmpStr.charAt(i) != target.charAt(i)) cnt++;
            }

            if (cnt == 1) return true;
            return false;
        }
    }
}

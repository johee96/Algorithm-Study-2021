package programmers.level2;

import java.util.Arrays;
import java.util.HashSet;

public class 전화번호목록 {
    public static void main(String[] args) {

    }

    class 전화번호목록_Solution {
        public boolean solution(String[] phone_book) {
            boolean answer = true;
            HashSet<String> stringHashSet = new HashSet<>();
            Arrays.sort(phone_book);
            for (String str : phone_book) {
                for (String key : stringHashSet) {
                    if (str.startsWith(key)) return false;
                }
                stringHashSet.add(str);
            }

            return answer;
        }
    }

}

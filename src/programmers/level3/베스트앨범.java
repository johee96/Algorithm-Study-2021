package programmers.level3;

import java.util.*;

public class 베스트앨범 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        베스트앨범_Solution s = new 베스트앨범_Solution();
        System.out.print(s.solution(genres, plays));

    }

    static class 베스트앨범_Solution {
        public int[] solution(String[] genres, int[] plays) {
            int[] answer = {};
            HashMap<String, PriorityQueue<Album>> albumMap = new HashMap<>();
            HashMap<String, Integer> totalMap = new HashMap<>();
            for (int i = 0; i < genres.length; i++) {
                PriorityQueue<Album> pq = albumMap.getOrDefault(genres[i], new PriorityQueue<Album>());
                pq.add(new Album(i, plays[i]));
                albumMap.put(genres[i], pq);
                totalMap.put(genres[i], totalMap.getOrDefault(genres[i], 0) + plays[i]);
            }
            ArrayList<Integer> answerList = new ArrayList<>();

            List<String> keySetList = new ArrayList<>(totalMap.keySet());
            Collections.sort(keySetList, (o1, o2) -> (totalMap.get(o2).compareTo(totalMap.get(o1))));
            for (String key : keySetList) {
                answerList.add(albumMap.get(key).poll().num);
                if (albumMap.get(key).isEmpty())
                    continue;
                answerList.add(albumMap.get(key).poll().num);
            }
            answer = new int[answerList.size()];
            for(int i=0;i<answerList.size();i++)
                answer[i]  =answerList.get(i);
            return answer;
        }
    }

    static class Album implements Comparable<Album> {
        int num;
        int plays;

        public Album(int num, int plays) {
            this.num = num;
            this.plays = plays;
        }

        @Override
        public int compareTo(Album o) {
            if (o.plays == this.plays)
                return this.num - o.num;
            return o.plays - this.plays;
        }
    }

}

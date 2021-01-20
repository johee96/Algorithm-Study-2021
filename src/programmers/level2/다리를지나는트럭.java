package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public static void main(String[] args) {

    }

    class 다리를지나는트럭_Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            int answer = 1;
            Queue<Integer> bridge = new LinkedList<>();
            int[] endTime = new int[truck_weights.length];
            bridge.add(0); //index 0 번째 (맨 앞에 있는 트럭)
            endTime[0] = bridge_length + 1; //1초에 차가 들어가고 + 걸리는 시간(다리 길이)

            int idx = 1;
            int weightSum = truck_weights[0];

            while (!bridge.isEmpty()) {
                ++answer;
                int frontIdx = bridge.peek();
                if (endTime[frontIdx] == answer) {
                    bridge.poll();
                    weightSum -= truck_weights[frontIdx];
                }
                if (idx < truck_weights.length && weightSum + truck_weights[idx] <= weight) {
                    bridge.add(idx);
                    endTime[idx] = answer+bridge_length;
                    weightSum += truck_weights[idx];
                    idx++;
                }

            }
            return answer;
        }
    }
}

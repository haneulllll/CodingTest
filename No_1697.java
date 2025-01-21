import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class No_1697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 수빈이의 위치
        int K = sc.nextInt();  // 동생의 위치

        System.out.println(bfs(N, K));
        sc.close();

    }

    public static int bfs(int N, int K) {
        boolean [] visited = new boolean[100001];  // 방문여부를 기록하는 배열
        Queue<int[]> queue = new LinkedList<>();  // BFS 수행을 위한 큐
        queue.offer(new int[]{N,0});  // 수빈이 초기위치와 시간을 큐에 삽입 [위치,시간]
        visited[N] = true;  // 초기위치를 방문한 것으로 처리

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int position = current[0];  // 현재위치
            int time = current[1];  // 현재시간

            if (position == K) {
                return time;
            }

            int[] next_position = {position-1, position+1, position*2};  // 수빈이가 다음에 이동할 수 있는 위치
            for (int next : next_position) {
                if (next >= 0 && next <= 100000 && !visited[next]) {
                    visited[next] = true;
                    queue.offer(new int[]{next, time+1}); // 다음위치와 다음시간을 큐에 삽입
                }
            }
        }
        return -1;
    }
}

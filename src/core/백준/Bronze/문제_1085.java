package 백준.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문제_1085 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        // 가로(X축) 쪽에서 가장 가까운 벽 찾기 (왼쪽 vs 오른쪽)
        int minX = Math.min(x, w - x);

        // 세로(Y축) 쪽에서 가장 가까운 벽 찾기 (아래 vs 위)
        int minY = Math.min(y, h - y);

        // 가로 최소거리와 세로 최소거리 중 진짜 최솟값 찾기
        int result = Math.min(minX, minY);

        System.out.println(result);

    }

}

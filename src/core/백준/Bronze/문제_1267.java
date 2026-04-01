// package 백준.Bronze; <-- 제출할 때는 반드시 이 줄을 삭제해야 해!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { // 클래스 이름도 문제_1267 대신 Main으로 통일하는 게 가장 안전해
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int yTotal = 0;
        int mTotal = 0;

        for (int i = 0; i < N; i++) {
            int time = Integer.parseInt(st.nextToken());

            // 영식 요금
            yTotal += ((time / 30) + 1) * 10;
            // 민식(민호) 요금
            mTotal += ((time / 60) + 1) * 15;
        }

        // [핵심 수정 포인트] 출력할 때 알파벳 뒤에 꼭 공백 한 칸 띄우기!
        if (yTotal < mTotal) {
            System.out.println("Y " + yTotal);
        } else if (yTotal > mTotal) {
            System.out.println("M " + mTotal);
        } else {
            System.out.println("Y M " + yTotal);
        }
    }
}
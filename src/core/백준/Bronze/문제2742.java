package 백준.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문제2742 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 결과값을 한 번에 모아서 출력하기 위한 StringBuilder
        StringBuilder sb = new StringBuilder();

        //자연수 N
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

}

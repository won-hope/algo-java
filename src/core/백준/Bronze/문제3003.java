package 백준.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문제3003 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        int[] chess = {1, 1, 2, 2, 2, 8};


        for (int i =0; i<6; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(chess[i] - num).append(" ");
        }
        System.out.println(sb);
    }

}

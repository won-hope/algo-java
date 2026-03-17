package 백준.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 문제2338 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());

        // 덧셈
        System.out.println(A.add(B));
        // 뺼셈
        System.out.println(A.subtract(B));
        //곱셈
        System.out.println(A.multiply(B));

    }

}

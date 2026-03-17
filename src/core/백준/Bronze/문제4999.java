package 백준.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문제4999 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();

        if (A.length() >= B.length()){
            System.out.println("go");
        }else {
            System.out.println("no");
        }
    }

}

package 백준.BronzeV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 검증수
{
public static void main(String[] args) throws Exception {
    // 입력 도구 세팅
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 한 줄에 숫자 5개가 공백으로 구분되어 들어오니까
    StringTokenizer st = new StringTokenizer(br.readLine());
    int sum = 0;

    for (int i=0; i< 5; i++){
        int n = Integer.parseInt(st.nextToken());
        sum += n * n;
    }
    System.out.println(sum % 10);
}

}
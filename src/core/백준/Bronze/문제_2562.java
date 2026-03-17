package 백준.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문제_2562 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxValue = -1;
        int maxindex = 0;

        for (int i =1; i<= 9; i++){
            int currentHousePrice = Integer.parseInt(br.readLine());
            if (currentHousePrice > maxValue) {
                maxValue = currentHousePrice;
                maxindex = i;
            }
        }
        System.out.println(maxValue);
        System.out.println(maxindex);
    }

}

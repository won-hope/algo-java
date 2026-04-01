import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int result = 1;

            for (int i = 0; i < B % 4 + 4; i++) {
                result = (result * A) % 10;
            }
            if (result == 0) {
                result = 10;
            }
            sb.append(result).append('\n');
        }
        System.out.println(sb);
        ;
    }
}
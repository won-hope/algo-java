import java.io.*;
import java.math.BigInteger; // 1. BigInteger를 위해 임포트!

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문제는 총 3개의 테스트 케이스로 이루어져 있어.
        for (int i = 0; i < 3; i++) {
            // N을 읽어온다 (합쳐야 할 숫자의 개수)
            // readLine()이 null일 경우를 대비해 예외처리를 하거나 체크하면 좋아.
            String line = br.readLine();
            if (line == null) break;

            int N = Integer.parseInt(line);

            // 합계를 저장할 BigInteger (0으로 초기화)
            BigInteger sum = BigInteger.ZERO;

            for (int j = 0; j < N; j++) {
                // 한 줄씩 숫자를 읽어서 sum에 더해준다.
                BigInteger next = new BigInteger(br.readLine());
                sum = sum.add(next); // BigInteger는 객체라서 += 가 안 되고 .add()를 써야 해!
            }

            // 0과 비교 (signum()은 음수면 -1, 0이면 0, 양수면 1을 반환해)
            int result = sum.signum();

            if (result == 0) {
                System.out.println("0");
            } else if (result > 0) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
    }
}
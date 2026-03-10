import java.io.*;
import java.util.*;

public class Main {
    // BOJ-friendly fast input
    private static final class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        String next() throws IOException {
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = read()) != -1 && c <= ' ') { /* skip */ }
            if (c == -1) return null;
            do {
                sb.append((char) c);
            } while ((c = read()) != -1 && c > ' ');
            return sb.toString();
        }

        int nextInt() throws IOException {
            int c = read();
            while (c <= ' ' && c != -1) c = read();
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }

        long nextLong() throws IOException {
            int c = read();
            while (c <= ' ' && c != -1) c = read();
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            long val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
    }

    public static void main(String[] args) throws Exception {
        // For local testing, uncomment the next line and put input in input.txt
        // System.setIn(new FileInputStream("input.txt"));

        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();

        // TODO: solve here
        // Example:
        // int n = fs.nextInt();
        // for (int i = 0; i < n; i++) {
        //     int x = fs.nextInt();
        //     out.append(x).append('\n');
        // }

        System.out.print(out);
    }
}

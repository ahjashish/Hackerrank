package introduction;

import java.io.*;

/**
 * Created by artoves on 15/11/15.
 */
public class Loops {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        int a, b, n = 0;
        String[] inputs = new String[3];
        for (int i = 0; i < testcases; i++) {
            inputs = br.readLine().split(" ");
            a = Integer.parseInt(inputs[0]);
            b = Integer.parseInt(inputs[1]);
            n = Integer.parseInt(inputs[2]);
            if (a >= 0 && b >= 0 && a <= 50 && b <= 50) {
                if (n >= 1 && n <= 15) {
                    Loops loops = new Loops();
                    System.out.println(loops.series(a, b, n));
                }
            }
        }
    }

    public String series(int a, int b, int n) {
        int nextElem = a;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            nextElem = a;
            for (int j = 0; j <= i; j++) {
                nextElem += Math.pow(2, j) * b;
            }
            s.append(nextElem + " ");
        }
        return s.toString().trim();
    }
}

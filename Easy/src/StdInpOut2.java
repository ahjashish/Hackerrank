import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by artoves on 15/11/15.
 */
public class StdInpOut2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        double y = Double.parseDouble(br.readLine());
        String s = br.readLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + y);
        System.out.println("Int: " + x);
    }
}

import java.util.Scanner;

/**
 * Created by artoves on 15/11/15.
 */
public class DataTypes {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long a = Long.valueOf((long) Math.pow(2, 63)) + Long.valueOf(new Long(1));
        long b = Long.valueOf((long) Math.pow(2, 63));
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                DataTypes dataTypes = new DataTypes();
                System.out.println(dataTypes.showDataTypes(a, b, x));
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }

    public String showDataTypes(long a, long b, long x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x + " can be fitted in:\n");
        if (x >= -128 && x <= 127) sb.append("* byte\n");
        if (x >= -32768 && x <= 32767) sb.append("* short\n");
        if (x >= -2147483648 && x <= 2147483647) sb.append("* int\n");
        if (x >= ((-1) * a) && x <= b) sb.append("* long");
        return sb.toString().trim();
    }
}

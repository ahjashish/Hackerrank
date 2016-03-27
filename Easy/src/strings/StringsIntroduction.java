package strings;

import java.util.Scanner;

/**
 * Created by artoves on 27/03/16.
 */
public class StringsIntroduction {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        System.out.println(A.length() + B.length());
        if (0 < A.compareTo(B))
            System.out.println("Yes");
        else
            System.out.println("No");
        StringBuilder sb = new StringBuilder();
        sb.append(A.substring(0,1).toUpperCase());
        sb.append(A.substring(1));
        sb.append(" ");
        sb.append(B.substring(0,1).toUpperCase());
        sb.append(B.substring(1));
        System.out.println(sb.toString());
    }
}

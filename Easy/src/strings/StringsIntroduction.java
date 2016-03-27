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

        StringsIntroduction stringsIntroduction = new StringsIntroduction();
        System.out.print(stringsIntroduction.processStrings(A, B));
    }

    public String processStrings(String A, String B) {
        StringBuilder sb = new StringBuilder();
        sb.append(A.length() + B.length() + "\n");
        if (0 < A.compareTo(B))
            sb.append("Yes\n");
        else
            sb.append("No\n");
        sb.append(A.substring(0, 1).toUpperCase());
        sb.append(A.substring(1));
        sb.append(" ");
        sb.append(B.substring(0, 1).toUpperCase());
        sb.append(B.substring(1));
        return sb.toString();
    }
}

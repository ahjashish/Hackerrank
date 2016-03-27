package introduction;

import java.util.Scanner;

/**
 * Created by artoves on 18/03/16.
 */
public class EndOfFile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNext()){
            System.out.println(i + " " + sc.nextLine());
            i++;
        }
    }
}
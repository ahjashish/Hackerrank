package introduction;

import java.security.Permission;
import java.util.Scanner;

/**
 * Created by artoves on 20/03/16.
 */
public class IntToString {
    public static void main(String args[]) {

        Do_Not_Terminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            String s = String.valueOf(n);
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

//The following class will prevent you from terminating the code using exit(0)!
class Do_Not_Terminate {

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }
}
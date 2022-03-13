package problem1;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        boolean signedIn = false;
        while (!signedIn) {
            System.out.println("enter sign in info");
            try {
                SignIn(user);
                signedIn = true;
            } catch (WrongInfo e) {
                System.out.println(e);
                signedIn = false;
            }
        }
        System.out.println("you are signed in have fun");
    }

    static void SignIn(User user) throws WrongInfo {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();
        System.out.println("enter you user name");
        String uname = scanner.nextLine();
        System.out.println("enter you password");
        String password = scanner.nextLine();
        if (!Objects.equals(name, user.name) || !Objects.equals(uname, user.uname) || !Objects.equals(password, user.password))
            throw new WrongInfo("The information does not match please try again");
    }
}



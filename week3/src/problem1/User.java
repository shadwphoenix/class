package problem1;

import java.util.Scanner;

public class User {
    protected String name,uname,password;
    private boolean validPass = false;
    Scanner scanner = new Scanner(System.in);
    User(){
        System.out.println("enter your name");
        name = scanner.nextLine();
        System.out.println("enter your user name");
        uname = scanner.nextLine();
        while (!validPass) {
            System.out.println("enter your password");
            password = scanner.nextLine();
            try {
                Checker(password, name, uname);
                validPass = true;
            } catch (InvalidPassword e) {
                System.out.println(e);
                validPass = false;
            }
        }
    }
    static void Checker(String password,String name,String uname) throws InvalidPassword{
        if(password.length()<4)
            throw new InvalidPassword("password too short");
        if(password.equals(name))
            throw new InvalidPassword("password can not be name");
        if (password.equals(uname))
            throw new InvalidPassword("password can not be user name");
    }
}

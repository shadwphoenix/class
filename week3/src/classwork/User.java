package classwork;

import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);
    String name,family;
    int age;
    User(){
        System.out.println("enter your name");
        name = scanner.nextLine();
        System.out.println("enter you surname");
        family = scanner.nextLine();
        System.out.println("enter your age");
        age = scanner.nextInt();
    }
}

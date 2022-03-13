package problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws HasNumbers {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a sentence with no numbers");
        String input = scanner.nextLine();
        try {
            Check(input);
            System.out.println("this sentence is "+input.length()+" characters long good job");
        }
        catch (HasNumbers e){
            System.out.println(e);
        }
    }
    static void Check(String input) throws HasNumbers{
        if(input == null)
            throw new HasNumbers("you did not input a sentence");
        for (int i=0 ; i<input.length();i++)
            if(Character.isDigit(input.charAt(i)))
                throw new HasNumbers("this sentence does have a number");
    }
}

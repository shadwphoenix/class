package problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter you integer");
        int num = scanner.nextInt();
        Checker checker = new Checker(num);
        System.out.println("Even = " + checker.isEven()+"\nOdd = " + checker.isOdd());
        System.out.println("Positive = "+checker.isPositive()+"\nNegative = "+checker.isNegative()+"\nZero = "+checker.isZero());
    }
}

package problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers for the calculator");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        Calculation calculation = new Calculation(num1,num2);
        System.out.println(calculation);
    }
}

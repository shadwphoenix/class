package com.problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char stop='n';
        Scanner scanner = new Scanner(System.in);
        while (stop=='n'){
            Equation equation = new Equation();
            equation.Answer();
            System.out.println();
            System.out.println("do you want to stop y/n");
            stop = scanner.next().charAt(0);
        }
    }
}

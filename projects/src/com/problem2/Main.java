package com.problem2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char stop = 'n';
        int i=0;
        while (stop=='n') {
            ArrayList<Students> student = new ArrayList<>();
            student.add(new Students());
            System.out.println("your score is = " + student.get(i).Mark());
            System.out.println("you have passed = " + student.get(i).passed);
            System.out.println("are there more students left y/n ");
           stop = scanner.next().charAt(0);
           i++;
        }
    }
}
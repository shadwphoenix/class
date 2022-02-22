package com.problem3;

import java.util.Scanner;

public class Equation {
    Scanner scanner = new Scanner(System.in);
    float a,b,c,d,e,f,answerX,answerY;
    public Equation(){
        System.out.println("enter a for ax + by = e");
        a=scanner.nextInt();
        System.out.println("enter b for ax + by = e");
        b=scanner.nextInt();
        System.out.println("enter e for ax + by = e");
        e=scanner.nextInt();
        System.out.println("enter c for cx + dy = f");
        c=scanner.nextInt();
        System.out.println("enter d for cx + dy = f");
        d=scanner.nextInt();
        System.out.println("enter f for cx + dy = f");
        f=scanner.nextInt();
    }
    public void Answer(){
        if (a/b==c/d && e/f==a/c)
            System.out.println("has infinite answers");
        else if(a/b==c/d && e/f!=a/b)
            System.out.println("does not have an answers");
        else {
            answerX=(e*d-b*f)/(a*d-b*c);
            answerY=(a*f-e*c)/(a*d-b*c);
            System.out.println("has an answer x is = " + answerX + " y is = " + answerY);
        }
    }
}

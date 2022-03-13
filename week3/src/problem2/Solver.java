package problem2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Solver {
    Scanner scanner = new Scanner(System.in);
    public double a,b,c,delta;
    Solver(){
        System.out.println("enter a for ax^2+bx+c=0");
        a=scanner.nextDouble();
        System.out.println("enter b for ax^2+bx+c=0");
        b=scanner.nextDouble();
        System.out.println("enter c for ax^2+bx+c=0");
        c=scanner.nextDouble();
        delta = (b*b)-(4*a*c);
    }
    public double Solve1(){
        return ((-1 * b) - (sqrt(delta))) / (2 * a);
    }
    public double Solve2(){
        return ((-1 * b) + (sqrt(delta))) / (2 * a);
    }
}

package com.kasra;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter shape parameters for shape 1");
        Shapes shape1 = new Shapes();
        System.out.println("shape 1 area is " + shape1.Area() + "\n");
        System.out.println("enter shape parameters for shape 2");
        Shapes shape2 = new Shapes();
        System.out.println("shape 2 area is " + shape2.Area());
    }
}

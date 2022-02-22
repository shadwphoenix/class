package com.kasra;

import java.util.Scanner;

public class Shapes {
    float height,width;
    public Shapes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter height");
        height=scanner.nextFloat();
        System.out.println("enter width");
        width=scanner.nextFloat();
    }
    public float Area(){
        return width*height;
    }
}

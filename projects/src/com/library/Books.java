package com.library;

import java.util.Scanner;

public class Books {
    Scanner sc = new Scanner(System.in);
    String name;
    boolean available = true;
    public Books(){
        System.out.println("enter book name");
        name = sc.nextLine();
    }
    public void Borrow(){
        available = false;
    }
    public void Return(){
        available = true;
    }
}

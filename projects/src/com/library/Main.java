package com.library;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char cont = 'y';
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> book = new ArrayList<>();
        while (cont == 'y') {
            System.out.println("""
                    what operation do you want to do
                    1)add a book
                    2)borrow a book
                    3)return a book
                    4)check book status""");
            byte opt = scanner.nextByte();
            scanner.nextLine();
            int find=0;
            String search;
            switch (opt){
                case 1 ->
                        book.add(new Books());
                case 2 ->{
                    System.out.println("enter the name of book");
                    search=scanner.nextLine();
                    for(int i = 0 ; i<book.size() ; i++)
                        if(Objects.equals(book.get(i).name, search))
                            find=i;
                    if(book.get(find).available)
                        book.get(find).Borrow();
                    else
                        System.out.println("book not available");
                }
                case 3->{
                    System.out.println("enter the name of book");
                    search=scanner.nextLine();
                    for(int i = 0 ; i<book.size() ; i++)
                        if(Objects.equals(book.get(i).name, search))
                            find=i;
                    book.get(find).Return();
                }
                case 4->{
                    System.out.println("enter the name of book");
                    search=scanner.nextLine();
                    for(int i = 0 ; i<book.size() ; i++)
                        if(Objects.equals(book.get(i).name, search))
                            find=i;
                    System.out.println("this book is available = " + book.get(find).available);
                }
            }
            System.out.println("wanna continue y/n");
            cont=scanner.next().charAt(0);
        }
    }
}
package com.problem2;

import java.util.Scanner;

public class Students {
    String name,family;
    float finalScore;
    Scanner scanner = new Scanner(System.in);
    boolean passed=false;
    public Students(){
        System.out.println("enter student name");
        name=scanner.nextLine();
        System.out.println("enter student surname");
        family=scanner.nextLine();
    }
    public float Mark(){
        System.out.println("how many scores are there");
        int number=scanner.nextInt();
        float[] marks = new float[number];
        int[] factors = new int[number];
        int faceSum=0;
        float bottomSum=0;
        for (int i=0 ; i<number ; i++) {
            System.out.println("what is the score");
            marks[i]=scanner.nextFloat();
            System.out.println("what is the factor of the score");
            factors[i] = scanner.nextInt();
            bottomSum += factors[i];
            faceSum += factors[i]*marks[i];
            finalScore = faceSum/bottomSum;
        }
        if (finalScore>10)
            passed=true;
        return finalScore;
    }
}

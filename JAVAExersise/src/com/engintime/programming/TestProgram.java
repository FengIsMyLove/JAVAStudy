package com.engintime.programming;

import java.util.Scanner;

public class TestProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = 4 * 3.1415926 * Math.pow(r, 2);
        double volume = 4.0 / 3 * 3.1415926 * Math.pow(r, 3);
        System.out.printf("The area of the sphere is:%.2f%n", area);
        System.out.printf("The volume of the sphere is:%.2f", volume);
    }
}
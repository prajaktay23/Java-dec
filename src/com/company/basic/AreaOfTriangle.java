package com.company.basic;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the width:");
        double width = scanner.nextDouble();
        System.out.println("enter the height:");
        double height = scanner.nextDouble();
        double ans = width * height / 2.0D;
        System.out.println("area of triangle is: " + ans);
    }
}

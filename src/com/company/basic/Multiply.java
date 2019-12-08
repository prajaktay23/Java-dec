package com.company.basic;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 2 no.s:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Multiplication is: " + a * b);
    }
}

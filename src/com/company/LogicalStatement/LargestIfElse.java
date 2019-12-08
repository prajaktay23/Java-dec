package com.company.LogicalStatement;

import java.util.Scanner;

public class LargestIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st no:");
        int a = scanner.nextInt();
        System.out.println("enter 2st no:");
        int b = scanner.nextInt();
        System.out.println("enter 3st no:");
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is largest no.");
        } else if (b > a && b > c) {
            System.out.println(b + " is largest no.");
        } else {
            System.out.println(c + " is largest no.");
        }
    }
}

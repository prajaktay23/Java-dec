package com.company.LogicalStatement;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st no:");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is even no");
        } else {
            System.out.println(a + " is odd no.");
        }

    }
}
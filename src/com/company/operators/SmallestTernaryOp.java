package com.company.operators;

import java.util.Scanner;

public class SmallestTernaryOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st no:");
        int a = scanner.nextInt();
        System.out.println("enter 2st no:");
        int b = scanner.nextInt();
        System.out.println("enter 3st no:");
        int c = scanner.nextInt();
        int temp = a < b ? a : b;
        int smallest = c < temp ? c : temp;
        System.out.println("smallest no. is: " + smallest);
    }
}

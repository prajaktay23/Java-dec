package com.company.basic;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = scanner.next().charAt(0);
        System.out.println("the ASCII value of " + ch + " is: " + ch);
    }
}

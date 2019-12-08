package com.company.LogicalStatement;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a no.: ");
        n=scanner.nextInt();
        long fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}

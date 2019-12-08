package com.company.LogicalStatement;

import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {
        int n,count,total=0;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            total=total+i;
        }
        System.out.println("sum of all natural no.s is: "+total);
    }
}

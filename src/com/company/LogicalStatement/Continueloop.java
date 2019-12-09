package com.company.LogicalStatement;

public class Continueloop {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            if (i==5 || i==2) {
                continue;
            }
            System.out.println(i);
        }
    }
}

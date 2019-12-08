package com.company.LogicalStatement;

import java.util.Scanner;

public class CalcSwitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 1st no.: ");
        int a=scanner.nextInt();
        System.out.println("enter 2st no.: ");
        int b=scanner.nextInt();
        System.out.println("enter an operator (+,-,*,/)");
        char operator=scanner.next().charAt(0);
        double output;
        switch(operator)
        {
            case '+':
                output=a+b;
                break;

            case '-':
                output=a-b;
                break;

            case '*':
                output=a*b;
                break;

            case '/':
                output=a/b;
                break;

            default:
                System.out.println("you have entered wrong operator");
                return;
        }
        System.out.println(a+""+operator+""+b+"="+output);
    }
}

package com.company.LogicalStatement;

import java.util.Scanner;

public class FiboseriesFor {
    public static void main(String[] args) {
        int n,num1=0,num2=1;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        System.out.println("Fibo series of "+n+" numbers:");
        for (int i=1;i<=n;i++){
            System.out.println(num1+"");
            int sumOfPrevTwo=num1+num2;
            num1=num2;
            num2=sumOfPrevTwo;
        }
    }
}
//    public static void main(String[] args) {
//
//        int count = 7, num1 = 0, num2 = 1;
//        System.out.print("Fibonacci Series of "+count+" numbers:");
//
//        int i=1;
//        while(i<=count)
//        {
//            System.out.print(num1+" ");
//            int sumOfPrevTwo = num1 + num2;
//            num1 = num2;
//            num2 = sumOfPrevTwo;
//            i++;
//        }
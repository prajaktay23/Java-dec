package com.company.LogicalStatement;

import java.util.Scanner;

public class SwitchVowels {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean isVowel=false;
        System.out.println("Enter a character: ");
        char ch=scanner.next().charAt(0);
        scanner.close();
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isVowel=true;
        }
        if (isVowel == true){
            System.out.println(ch+" is a vowel");
        }
        else{
            if ((ch>='a'&&ch<='z')||(ch>='A'&& ch<='Z'))
                System.out.println(ch+" is a constant");
            else
                System.out.println("Input is not an alphabet");
        }
    }
}

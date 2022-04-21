package com.averkina;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static boolean isPalindrome01(String input) {
        input = input.toLowerCase().trim();
        if(input == "") {
            return false;
        }

        for(int i = 0, j = input.length() - 1; i < (input.length() / 2); i++, j--){
            if(input.toCharArray()[i] != input.toCharArray()[j]){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome02(String input) {
        input = input.toLowerCase().trim();
        if(input == "") {
            return false;
        }

        String reverse  = new StringBuffer(input).reverse().toString();

        return input.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "";
        System.out.print("Введите строку: ");
        str = in.nextLine();

        if(isPalindrome01(str)) {
            System.out.print("Палиндром!");
        }
        else {
            System.out.print("Не палиндром!");
        }
    }
}

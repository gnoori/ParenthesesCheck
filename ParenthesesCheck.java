package com.interviewpractice;

import java.util.Scanner;
/*
You are given a String that contains left and right parenthesis characters.
Write code to determine whether the parentheses are correctly nested.
For example, the Strings "(())" and "()()" are correctly nested, but "(()()" and ")(" are not
 */
public class ParenthesesCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a phrase to check for parentheses correctness:");
        String sentence = in.nextLine();
        //checks is there are equal number of opening and closing parentheses
        System.out.println(check(sentence));
        //checks if the parentheses are nested correctly
        System.out.println(check2(sentence));
    }
//checks is there are equal number of opening and closing parentheses
    public static boolean check(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(')
                count++;
            else if (input.charAt(i) == ')')
                count++;
        }
        if (count % 2 == 0)
            return true;
        else
            return false;
    }
//checks if the parentheses are nested correctly
    public static boolean check2(String in) {
        int count = 0;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == '(')
                count++;
            else if (in.charAt(i) == ')') {
                count--;
                if (count < 0) return false;
            }
        }
        return count == 0;
    }
}
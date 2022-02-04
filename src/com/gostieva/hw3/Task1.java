package com.gostieva.hw3;

public class Task1 {
    public static void main(String[] args) {
        String text = "Hello Students";
        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {
        String getText = text.replaceAll(" ", "");
        System.out.println(getText);
        return getText.equalsIgnoreCase((new StringBuilder(getText).reverse().toString()));
    }

}
